package 문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 다트게임 {
    public static void main(String[] args) {
        String dartResult = "0T#0T#0T*";
        char[] d = dartResult.toCharArray();
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        System.out.println("배열 : " + Arrays.toString(d));

        for (int i = 0; i < d.length; i++) {
            System.out.println("1 for문 : 현재 값, 순서 - " + d[i] + ", " + i);

            switch (d[i]) {
                case 'S':
                    bonus(list, d,i, 0);
                    break;
                case 'D':
                    bonus(list, d,i, 1);
                    break;
                case 'T':
                    bonus(list, d,i, 2);
                    break;
                case '*':
                    option(list,2);
                    break;
                case '#':
                    option(list,-1);
                    break;
            }
        }
        for (int l : list) {
            answer += l;
        }
        System.out.println("리스트 : " + list);
        System.out.println("답 : " + answer);
    }

    private static void option(List<Integer> list, int times) {
        int current = list.size() - 1;
        list.set(current, list.get(current) * times);
        System.out.println("list.get - "+list.get(0));
        if (current>0 && times==2) {
            list.set(current-1, list.get(current-1) * times);
        }
    }

    private static void bonus(List<Integer> list, char[] d, int i, int n) {
        int currentNum = d[i - 1] - '0';
        // char type '1' -> int type 1 = 49가 나오기 때문에 -'0'을 해주면 된다.
        if (i>1) {
            if (currentNum == 0 && d[i - 2] - '0' == 1) currentNum = 10;
        }
        int num =currentNum;
        for (int j = 0; j < n; j++) {
            System.out.println("제곱");
            num *= currentNum;
        }
        list.add(num);
        System.out.println("리스트에 더해진 값 : " + list);
    }
}

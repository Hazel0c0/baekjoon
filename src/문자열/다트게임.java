package 문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 다트게임 {
  public static void main(String[] args) {
    int answer = 0;
    String dartResult = "1S*2T*3S";
    char[] d = dartResult.toCharArray();
    List<Integer> list = new ArrayList<>();
    int result = 0;

    for (int i = 0; i < d.length; i++) {
      System.out.println("d의 값 : "+ Arrays.toString(d));
      switch (d[i]) {
        case 'S':
          result = bonus(d, i, 0);
        case 'D':
          result = bonus(d, i, 1);
        case 'T':
          result = bonus(d, i, 2);
        case '*':
          result = option(list, result, 2);
        case '#':
          result = option(list, result, -1);
      }
      list.add(result);
      System.out.println("list에 저장된 값 : "+ result);
    }
    for (int l : list) {
      System.out.println("l의 값 : "+l);
      answer+=l;
    }
    System.out.println(answer);
  }

  private static int option(List<Integer> list, int result, int num) {
    result *= num;
    if (list.isEmpty()) {
      int size = list.size();
      for (int j = 0; j < size; j++) {
        list.set(j, list.get(j) * 2);
      }
    }
    return result;
  }

  private static int bonus(char[] d, int i, int n) {
    int num = (int) d[i - 1];
    System.out.println("num : " +num);
    for (int j = 0; j < n; j++) {
      num *= num;
    }
    return num;
  }
}

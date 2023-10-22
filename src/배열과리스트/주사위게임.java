package 배열과리스트;

import java.util.Arrays;
import java.util.Scanner;

public class 주사위게임 {
  public int solution(int a, int b, int c, int d) {

    // 정렬
    int[] num = {a, b, c, d};
    Arrays.sort(num);
    System.out.println(Arrays.toString(num));

    int answer = getAnswer(num[0],num[1],num[2],num[3]);


    return answer;
  }

  private static int getAnswer(int a, int b, int c, int d) {
    if (a == d){
      return 1111*a;
    } else if(a == c || b == d){
      System.out.println("세 수가 같다");
      if (c==d) d=a;
      return (10* c + d)*(10* c + d);
    } else if (a == b && c == d) {
      return (a + c)*Math.abs(a - c);
    } else if (a == b || b ==c || c==d){
      if (a==b) {
        return c*d;
      } else if (b ==c ) {
        return a*d;
      } else {
        return a*b;
      }
    } else {
      return a;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,c,d;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();

    주사위게임 sol = new 주사위게임();
    int result = sol.solution(a, b, c, d);
    System.out.println(result);
  }
}

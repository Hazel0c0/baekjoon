package 연산;

public class 토너먼트_경기 {
  /*
  n명 참가, 토너먼트 형식
  1번부터 n번 까지 배정
  1-2/3-4...
  A는 B(경쟁자)와 언제 만날까?
   */
  static public int solution(int n, int a, int b) {
/*
  *1*2
  1*$2-/#*34
  /1*2/3$4/-#5*6/78
  12 /*34/5$6/78-/#9 10/*11 12/  ../.16
 */
    System.out.println(1/2);
    System.out.println(2/2);
    System.out.println(3/2);
    System.out.println(4/2);

    int round = 0;
    while (a != b) {
      round++;
      a = (a + 1) / 2;
      b = (b + 1) / 2;
    }

    return round;
  }

  public static void main(String[] args) {
    solution(8, 4, 7);
  }

}

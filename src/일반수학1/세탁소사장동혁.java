package 일반수학1;

import java.util.Scanner;

public class 세탁소사장동혁 {
  public static void main(String[] args) {
    int Q, D, N, P;
    Q = 25;
    D = 10;
    N = 5;
    P = 1;

    Scanner sc = new Scanner(System.in);
//    System.out.println("횟수 입력 : ");
    int T = sc.nextInt();// 횟수

    for (int i = 0; i < T; i++) {
//      System.out.println("거스름 돈 : ");
      int C = sc.nextInt(); // 거스름돈

      int q = C / Q;
      C = C%Q;

      int d = C / D;
      C = C%D;

      int n = C / N;
      C = C%N;

      int p = C / P;

      System.out.println(q + " " + d + " " + n + " " + p);
    }
  }
}

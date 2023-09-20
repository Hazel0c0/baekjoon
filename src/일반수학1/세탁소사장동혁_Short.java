package 일반수학1;

import java.util.Scanner;

public class 세탁소사장동혁_Short {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T--!=0) {
      int C = sc.nextInt();
      System.out.println(C/25+" "+C%25/10+" "+C%25%10/5+" "+C%25%10%5);
    }
  }
}

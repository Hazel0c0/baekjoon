package 조건문과반복문;

import java.util.Scanner;

public class 홀짝_구분하기_삼항연산자 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
  }
}

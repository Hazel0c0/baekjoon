package 조건문과반복문;

import java.util.Scanner;

public class 반복문 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()){
      int i = sc.nextInt();
      int j = sc.nextInt();
      System.out.println(i+j);
    }
  }
}

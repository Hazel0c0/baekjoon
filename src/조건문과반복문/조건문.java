package 조건문과반복문;

import java.util.Scanner;

public class 조건문 {
  public static void main(String[] args) {
    /*
    주사위 3개
    - 같은 눈 3개 : 10,000 + 눈 * 1,000
    -        2개 : 1000+ 눈 * 100
    - 모두 다른 눈 : 가장 큰 눈 * 100
     */
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    System.out.println(x + " " + y + " " + z);

    if (x == y && y == z) {
      System.out.println(10000 + x * 1000);
    } else if (x == y || x == z) {
      System.out.println(1000 + x * 100);
    } else if (y == z) {
      System.out.println(1000 + y * 100);
    } else {
      System.out.println(Math.max(x, Math.max(y, z)) * 100);
    }
  }
}

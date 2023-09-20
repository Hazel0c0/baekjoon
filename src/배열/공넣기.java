package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 공넣기 {
  public static void main(String[] args) {
    /*
    바구니 n개 - 첫 바구니 비어있고, 바구니 당 공 1개
    공을 m번 넣을 것임 - 같은 번호의 공을 넣을거야
    * 공이 있다면 기존 걸 빼고 새로 공을 넣는다
    각 바구니에 든 공의 번호 구하기
     */

    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt(); // 바구니 수
    m = sc.nextInt();
    // i,j,k - i~j : k번의 공을 넣을 거다

    int[] basket = new int[n];
    for (int num = 0; num < m; num++) {
      int i, j, k;
      i = sc.nextInt();
      j = sc.nextInt();
      k = sc.nextInt();

      for (int l = i - 1; l < j; l++) {
        basket[l] = k;
      }
    }
    for (int k = 0; k < basket.length; k++) {
      System.out.print(basket[k] + " ");
    }
  }
}

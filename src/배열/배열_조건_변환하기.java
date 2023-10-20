package 배열;

import java.util.Arrays;

public class 배열_조건_변환하기 {
  public int solution(int[] arr) {
    return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
  }

  private int cntAction(int n) {

    int cnt = 0;
    boolean flag = true;

    while (flag) {

      if (n % 2 == 0 && 50 <= n) {
        n /= 2;
        cnt++;
      } else if (n % 2 == 1 && n < 50) {
        n *= 2;
        n += 1;
        cnt++;
      } else {
        flag = false;
      }
    }
    return cnt;
  }
}

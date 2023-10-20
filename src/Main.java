import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    // 조건에 맞게 수열 변환하기 2
    int[] arr= {1, 2, 3, 100, 99, 98};
    for (int val : arr) {
      if (val >= 50 && val % 2 == 0) val /= 2;
      else if (val < 50 && val % 2 == 1) val = val * 2 + 1;
    }
    System.out.println(Arrays.toString(arr));

  }
}

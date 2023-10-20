import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    // 조건에 맞게 수열 변환하기 2
    int[] arr= {1, 2, 3, 100, 99, 98};
    for (int i=0;i< arr.length;i++) {
      if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
      else if (arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
    }
    System.out.println(Arrays.toString(arr));

  }
}

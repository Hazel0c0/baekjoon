class Solution {
  public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
    // 최대 공약수 구하기
    int divisor = divisor(denom1, denom2);

    int common = denom1 * denom2 / divisor;
    int multi1 = common / denom1;
    int multi2 = common / denom2;

    int n1 = numer1 * multi1;
    int n2 = numer2 * multi2;

    // 기약 분수 만들기
    int[] result = fraction(n1 + n2, common);

    return result;
  }

  public static int divisor(int a, int b) {
    if (b == 0) {
      return a;
    }
    return divisor(b, a % b);
  }

  public static int[] fraction(int n, int d) {
    int[] result = new int[2];
    int divisor = divisor(n, d);

    result[0] = n/divisor;
    result[1] = d/divisor;

    return result;
  }
    
}
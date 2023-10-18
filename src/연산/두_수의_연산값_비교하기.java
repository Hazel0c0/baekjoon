package 연산;

public class 두_수의_연산값_비교하기 {
  public int solution(int a, int b) {
    return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
  }
}

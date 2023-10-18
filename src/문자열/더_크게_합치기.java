package 문자열;

public class 더_크게_합치기 {
  // if문 대신 연산식 사용
  public int solution(int a, int b) {
    int answer = 0;
    int aLong = Integer.parseInt(""+a+b);
    int bLong = Integer.parseInt(""+b+a);
    answer = aLong > bLong ? aLong : bLong;

    return answer;
  }
}

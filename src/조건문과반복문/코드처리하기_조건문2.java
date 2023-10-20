package 조건문과반복문;

public class 코드처리하기_조건문2 {
  public static void main(String[] args) {

    코드처리하기_조건문2 a = new 코드처리하기_조건문2();
    String result = a.solution("abc1abc1abc");
    System.out.println(result);
  }

  public String solution(String code) {
    StringBuilder answer = new StringBuilder();
    int mode = 0;
    for (int i = 0; i < code.length(); i++) {
      char current = code.charAt(i);
      if (current == '1') {
        mode = mode == 0 ? 1 : 0;
        continue;
      }

      if (i % 2 == mode) {
        answer.append(current);
      }
    }
    return answer.length() == 0 ? "EMPTY" : answer.toString();
  }
}

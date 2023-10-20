package 조건문과반복문;

public class 코드처리하기_조건문 {
  public static void main(String[] args) {

    코드처리하기_조건문 a = new 코드처리하기_조건문();
    String result = a.solution("abc1abc1abc");
    System.out.println(result);
  }

  public String solution(String code) {
    String ret = "";
    char[] charArray = code.toCharArray();
    int mode = 0;

    for (int i = 0; i < charArray.length; i++) {
      if (mode == 0) {
        if (charArray[i] == '1') mode = 1;
        else {
          if (i % 2 == 0) ret += charArray[i];
        }
      } else if (mode == 1) {
        if (charArray[i] == '1') mode = 0;
        else {
          if (i % 2 != 0) ret += charArray[i];
        }
      }
    }
    if (ret == "") ret = "EMPTY";
    return ret;
  }
}

package 문자열;

public class 문자열_겹쳐쓰기 {
  // substring(int) 문자열 자르기
  public String solution(String my_string, String overwrite_string, int s) {
    String before = my_string.substring(0, s);
    String after = my_string.substring(s + overwrite_string.length());
    return before + overwrite_string + after;
  }
}

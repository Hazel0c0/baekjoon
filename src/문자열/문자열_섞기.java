package 문자열;

public class 문자열_섞기 {
  // str.charAt(index) : char 타입으로 변환
  public String solution(String str1, String str2) {
    String answer = "";

    for(int i = 0; i < str1.length(); i++){
      answer+= str1.charAt(i);
      answer+= str2.charAt(i);
    }
    return answer;
  }
}

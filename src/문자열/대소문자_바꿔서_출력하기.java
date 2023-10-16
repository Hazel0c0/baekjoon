package 문자열;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = "Hello, Java!";

    StringBuilder sb = new StringBuilder();
    for(char c:a.toCharArray()){
      if(Character.isUpperCase(c)) {
        sb.append(Character.toLowerCase(c));
      } else if(Character.isLowerCase(c)){
        sb.append(Character.toUpperCase(c));
      }
    }
    System.out.println(sb);
  }
}

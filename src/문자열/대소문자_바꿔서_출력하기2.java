package 문자열;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String answer = "";

    for(Character c : a.toCharArray()){
      if(Character.isUpperCase(c)){
        answer += Character.toLowerCase(c);
      }
      else if(Character.isLowerCase(c)){
        answer += Character.toUpperCase(c);
      }
    }
    System.out.println(answer);
  }
}

package 스택과큐;

import java.util.Stack;

public class 스택으로변경_괄호지우기 {
  /*
  배열은 0~9까지 숫자로 이루어져있다.
  연속 된 숫자 제외, 순서 그대로
   */

  public static boolean solution(String str) {
    Stack<Character> stack = new Stack<>();

    boolean empty;
    for(char c:str.toCharArray()){
     if(c=='('){
       stack.push(c);
     } else if (!stack.isEmpty() && c==')') {
       stack.pop();
     } else {
       return false;
     }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    solution("()()");
  }

}

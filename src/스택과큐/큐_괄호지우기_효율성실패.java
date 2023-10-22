package 스택과큐;

import java.util.LinkedList;
import java.util.Queue;

public class 큐_괄호지우기_효율성실패 {
  /*
  배열은 0~9까지 숫자로 이루어져있다.
  연속 된 숫자 제외, 순서 그대로
   */

  public static boolean solution(String str) {
    Queue<Character> queue = new LinkedList<>();

    boolean empty;
    for(char c:str.toCharArray()){
      if (queue.isEmpty() && c==')') {
        queue.add(c);
        break;
      } else if(queue.isEmpty() || queue.peek()==c){
        queue.add(c);
      } else if (queue.peek()!=c) {
        queue.remove();
      }
    }
    empty = queue.isEmpty();

    return empty;
  }

  public static void main(String[] args) {
    solution("()()");
  }

}

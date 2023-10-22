package 스택과큐;

import java.util.Arrays;
import java.util.Stack;

public class 스택_연속된_중복_숫자_제외 {
  /*
  배열은 0~9까지 숫자로 이루어져있다.
  연속 된 숫자 제외, 순서 그대로
   */

  public static int[] solution(int[] arr) {
    Stack<Integer> stack = new Stack<>();

    for (int num : arr) {
      // 스택이 비어있거나 / 맨 위에 숫자가 num과 다르면
      if (stack.isEmpty() || stack.peek() != num) {
        // 스택에 넣는다
        stack.push(num);
      }
    }

    int[] answer = new int[stack.size()];
    for (int i = stack.size() - 1; i >= 0; i--) {
      answer[i] = stack.pop();
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] result = solution(new int[]{3, 3, 3, 2, 2, 4,3,3});
    System.out.println(Arrays.toString(result));
  }

}

import java.util.Stack;
class Solution {
  public Stack<Integer> solution(int[] arr) {
    Stack<Integer> stk = new Stack<>();
    
    int i = 0;
    while ( i < arr.length) {
      if (stk.isEmpty() || stk.peek() < arr[i]) {
        stk.add(arr[i]);
        i++;
      } else {
        stk.pop();
      }
    }
    return stk;
  }
}
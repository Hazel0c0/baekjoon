import java.util.Stack;

class Solution {
    boolean solution(String str) {
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
}
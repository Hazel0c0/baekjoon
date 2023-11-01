import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        Queue<Integer> queue = new LinkedList<>();
        for(int n:numLog){
            queue.add(n);
        }
        int before=queue.poll(); // 0
        while (true){
            int after=queue.poll(); // 1
            switch (after-before){ // 1
                case 1: answer+="w"; break;
                case -1: answer+="s"; break;
                case 10: answer+="d"; break;
                case -10: answer+="a"; break;
            }
            before+=(after-before); // 1
            if (queue.isEmpty()) return answer;
        }
    }
}
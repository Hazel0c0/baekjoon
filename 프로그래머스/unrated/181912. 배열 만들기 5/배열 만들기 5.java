import java.util.ArrayList;
import java.util.List;
class Solution {
  public List<Integer> solution(String[] intStrs, int k, int s, int l) {
    List<Integer> answer = new ArrayList<>();
    for(String str:intStrs){
      int substring = Integer.parseInt(str.substring(s, s+l));
      if(substring>k){
        answer.add(substring);
      }

    }
    return answer;
  }
}
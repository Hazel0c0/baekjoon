import java.util.*;

class Solution {
  public int[] solution(int[] arr, int[][] queries) {
   int[] answer = new int[queries.length];

    int index = 0;
    for (int[] i : queries) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int j = i[0]; j <= i[1]; j++) {
          if (arr[j] > i[2]) {
            result.add(arr[j]);
          }
        }
        if(result.isEmpty()) {
          answer[index++]=-1;
          continue;
        }
        Collections.sort(result);
        answer[index++] = result.get(0);
      }
    return answer;
  }
}
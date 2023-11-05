package 배열과리스트;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_수열과구간쿼리 {

  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];

    for (int idx = 0; idx < queries.length; idx++) {
      int[] query = queries[idx];
      int s = query[0], e = query[1], k = query[2];

      ArrayList<Integer> result = new ArrayList<Integer>();
      for (int j = s; j <= e; j++) {
        if (arr[j] > k) {
          result.add(arr[j]);
        }
      }
      if(result.isEmpty()) {
        answer[idx]=-1;
        continue;
      }
      Collections.sort(result);
      answer[idx] = result.get(0);
    }
    return answer;
  }
}
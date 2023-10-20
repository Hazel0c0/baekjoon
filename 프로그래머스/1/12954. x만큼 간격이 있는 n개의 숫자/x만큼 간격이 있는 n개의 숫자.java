import java.util.ArrayList;
import java.util.List;

class Solution {
    public long[] solution(int x, int n) {
        
    long[] longList = new long[n];

    for (int i=0;i<n;i++){
      longList[i]=(long)x*(i+1);
    }
        return longList;
    }
}
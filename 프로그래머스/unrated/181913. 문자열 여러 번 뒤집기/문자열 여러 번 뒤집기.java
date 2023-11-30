class Solution {

        public String solution(String my_string, int[][] queries) {
      StringBuilder str = new StringBuilder(my_string);

      for (int[] query : queries) {
        int s = query[0], e = query[1];
        String substring = new StringBuilder(str.substring(s, e+1)).reverse().toString();

        str.replace(s,e+1, substring);
      }
      return str.toString();
    }

    
    
}
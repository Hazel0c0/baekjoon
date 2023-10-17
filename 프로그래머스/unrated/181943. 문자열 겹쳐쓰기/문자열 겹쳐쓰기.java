class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
    String answer ="";
    int count=0;
    for (char c : overwrite_string.toCharArray()) {
        count++;
    }
    StringBuilder sb=new StringBuilder();
    sb.append(my_string);
    sb.replace(s,s+count,overwrite_string);
     answer = sb.toString();
        return answer;
    }
}
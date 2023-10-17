class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        for(int i=0; i<s1.length; i++){
            answer+=s1[i];
            answer+=s2[i];
        }
    
        return answer;
    }
}
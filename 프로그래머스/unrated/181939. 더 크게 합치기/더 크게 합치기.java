class Solution {
    public int solution(int a, int b) {
        int aPlusb=Integer.parseInt(a+""+b);
        int bPlusa=Integer.parseInt(b+""+a);
        int answer = aPlusb;
        answer=aPlusb>bPlusa?aPlusb:bPlusa;
        
        return answer;
    }
}
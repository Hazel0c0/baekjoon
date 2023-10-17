class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aPlusb=Integer.parseInt(a+""+b);
        int bPlusa=Integer.parseInt(b+""+a);
        if (aPlusb>bPlusa) {
            answer=aPlusb;
        } else if (aPlusb<bPlusa){
            answer=bPlusa;
        } else {
            answer=aPlusb;
        }
        return answer;
    }
}
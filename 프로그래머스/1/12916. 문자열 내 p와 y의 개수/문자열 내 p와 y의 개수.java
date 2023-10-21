class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0, y=0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        char[] cArr=s.toCharArray();
        for(char c :  cArr) {
            if(c=='p'|| c=='P') p++;
            else if (c=='y'||c=='Y') y++;
        }
       

        return p==y?true:false;
    }
}
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int index=0;
        for (int n = start_num ; n<=end_num ; n++){
            answer[index++]=n;
        }
        return answer;
    }
}
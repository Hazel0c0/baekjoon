class Solution {
    public int[] solution(int[] num_list) { // 2,1,6
        int length=num_list.length; // 3
        int lastNum=num_list[(length-1)]; // 2 -> 6
        int previousNum=num_list[(length-2)]; // 1 -> 1
        
        int[] answer=new int[(length+1)]; // int[4]
        for(int i=0;i<length; i++){
            answer[i]=num_list[i];
        }
        
        if (previousNum<lastNum){
            answer[length]=(lastNum-previousNum);
        } else {
           answer[length]=(lastNum*2);
        }
        
        return answer;
    }
}
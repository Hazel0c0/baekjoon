class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] array:queries){
          int tem = arr[array[0]];
          arr[array[0]]=arr[array[1]];
          arr[array[1]]=tem;
        }
        
        return arr;
    }
}
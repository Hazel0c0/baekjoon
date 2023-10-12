import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
    int[] num = {a, b, c, d};
    Arrays.sort(num);

    int answer = getAnswer(num[0],num[1],num[2],num[3]);


    return answer;
  }

  private static int getAnswer(int a, int b, int c, int d) {
    if (a == d){
      return 1111*a;
    } else if(a == c || b == d){
      if (c==d) d=a;
      return (10* c + d)*(10* c + d);
    } else if (a == b && c == d) {
      return (a + c)*Math.abs(a - c);
    } else if (a == b || b ==c || c==d){
      if (a==b) {
        return c*d;
      } else if (b ==c ) {
        return a*d;
      } else {
        return a*b;
      }
    } else {
      return a;
    }
  }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        Solution sol = new Solution();
        int result = sol.solution(a, b, c, d);
        System.out.println(result);
      }
}
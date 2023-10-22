package 연산;

public class boolean_특수항_더하기 {
  public static int solution(int a, int d, boolean[] included) {
    /*
    a, a+d, a+d+d...
    true인 항들 더하기
     */
    int answer=0;
    for (int i=0; i<included.length; i++){
      if (included[i]) {
        answer+=a;
        answer+=d*i;
      }
      System.out.println(answer);
    }
    return answer;
  }

  public static void main(String[] args) {
    solution(3, 4, new boolean[]{true, false, false, true, true});
//    solution(7, 1, new boolean[]{false, false, false, true, false, false, false});
  }

}

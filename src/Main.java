import java.util.ArrayList;
import java.util.List;

public class Main {
  public static int solution(int a, int b, int c) {
    /*
    1~6 주사위, 3번 굴리기
    셋다 다르면 ++
    두개만 같으면 (++)*(^2+^2+^2)
    셋다 (++)*(^2+^2+^2)*(^3+^3+^3)
     */
    int answer = 0;
    if (a==b && b==c) {
      return (int) (27*Math.pow(a,6));
    } else if (a!=b && b!= c && a!= c){
      return a+b+c;
    } else {
      return (a+b+c)*(a*a+b*b+c*c);
    }
  }

  public static void main(String[] args) {
    solution(2	,6	,1);
    solution(5,3,3);
    solution(4,4,4);
  }

}

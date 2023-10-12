package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 달리기경주 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    달리기경주 sol = new 달리기경주();
    String[] result = sol.solution
        (new String[]{"mumu", "soe", "poe", "kai", "mine"}
        , new String[]{"kai", "kai", "mine", "mine"});
    System.out.println(Arrays.toString(result));
  }
  public String[] solution(String[] players, String[] callings) {
    String[] answer = {};
    answer=players;

    return answer;
  }
}

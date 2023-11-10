import java.util.ArrayList;
class Solution {
  public int[] solution(int l, int r) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = l; i <= r; i++) {
      if (zeroAndFive(i)) {
        list.add(i);
      }
    }
    if (list.isEmpty()) {
      return new int[]{-1};
    } else {
      return toArray(list);
    }
  }

  private static int[] toArray(ArrayList<Integer> list) {
    int[] answer = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i);
    }
    return answer;
  }

  private static boolean zeroAndFive(int num) {
    while (num > 0) {
      int result = num % 10;
      if (result!=0 && result != 5) {
        return false;
      }
      num /= 10;
    }
    return true;
  }
}
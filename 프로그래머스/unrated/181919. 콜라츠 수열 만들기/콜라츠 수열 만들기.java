import java.util.ArrayList;
import java.util.List;
class Solution {
 public List solution(int x) {

    List list = new ArrayList();
    list.add(x);

    do {
      x = (x % 2 == 0) ? (x / 2) : (3 * x + 1);
      list.add(x);
    } while (x!=1);

    return list;
  }
}
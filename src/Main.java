import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(34);
    System.out.println(list.size());

  }

  private static int times(char[] d, int i, int n) {
    int num = (int) d[i - 1];
    for (int j=0;j<n;j++){
      num*=num;
    }
    return num;
  }
}

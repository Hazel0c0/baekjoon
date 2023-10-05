import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int V; // 나무 막대 높이
    int A; // 낮에 올라갈 수 있는 높이
    int B; // 밤에 내려오는 높이
    // 정상에 올라가면 미끄러지지 않음. 정상에 도착 하는 시간은?

    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    V = sc.nextInt();

    int day = 0;
    while (V>0){
      V=V-A;
      if (V!=0) V=V+B;
    day++;
    }
    System.out.println(day);
  }
}

import java.util.LinkedList;
import java.util.Queue;

public class Main {
  /*
  트럭이 다리를 건너는데 2초씩 소요된다.
  모든 트럭이 건너가는데 걸리는 초는?
   */
  public static int solution(
      int bridge_length, // 다리 길이
      int weight, // 견딜 수 있는 무게
      int[] truck_weights // 트럭 무게
  ) {
    Queue<Integer> truck = new LinkedList<>(); // 트럭
    Queue<Integer> road = new LinkedList<>(); // 도로

    for (int t : truck_weights) {
      truck.add(t);
    }

    int minite = 0; // 초
    int trucks_weight = 0; // 도로 위 트럭들 무게

    while (!truck.isEmpty()) {
      minite++;
      System.out.println("minite = " + minite);
      int currTruck = truck.peek();

      // 도로 끝에 도착한 트럭들
      if (road.size() == bridge_length) {
        // 그 만큼 무게 제거
        Integer remove = road.remove();
        System.out.println("떠나간 트럭 = " + remove);
        trucks_weight -= remove;

        // 이 때 도로 위에 트럭이 올라 올 수 있는 무게라면
        if (trucks_weight + currTruck <= weight) {
          System.out.println(currTruck + "떠나간 뒤 트럭 입장");
          road.add(currTruck);
          trucks_weight += truck.remove(); // 도로 위 트럭 무게 저장
        }
        // [도로가 비었거나 || 도로 위 허용 가능 이하 무게 라면]
      } else if (road.isEmpty() || trucks_weight + currTruck <= weight) {
        System.out.println(currTruck + "트럭 입장");
        road.add(currTruck);
        trucks_weight += truck.remove(); // 도로 위 트럭 무게 저장
      } else {
        // 도로에 트럭이 올라가지 못할 경우 빈 자리
        road.add(0);
      }
      System.out.println("도로 위 트럭 무게 = " + road);
    }
    return minite + bridge_length;
  }

  public static void main(String[] args) {
    System.out.println(
        solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10})
    );
    System.out.println(
        solution(2, 10, new int[]{7, 4, 5, 6})
    );
    System.out.println(
        solution(100, 100, new int[]{10})
    );
  }
}

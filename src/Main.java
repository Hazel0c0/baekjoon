import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
//    Queue<Integer> road = new LinkedList<>(); // 도로
    Queue<Integer> truck = new LinkedList<>(); // 트럭

    for ( int t : truck_weights) {
      truck.add(t);
    }

    int minite = 0; // 초
    int trucks_weights = 0; // 도로 위 트럭들 무게
    int run = 0; // 도로 위로 트럭은 올라오지 못하고 기존의 트럭들만 진행할 때
    int n=0; // 트럭 순번

    while (true) {
      minite++;
      System.out.println("minite = " + minite);

      // [도로가 비었거나 || 도로 위 허용 가능 이하 무게 라면]
      if (road.isEmpty() || trucks_weights + truck_weights[n] <= weight) {
        trucks_weights = roadOnTruck(truck_weights[n], trucks_weights, road);

//      } else if (road.size() == bridge_length) {
//        road.remove();
//        trucks_weights -= road.remove();
//        if (road.peek() + currTruck < weight) {
//          trucks_weights = roadOnTruck(currTruck, trucks_weights, road);
//        }
        // [도로 위 차 개수 + 도로의 남은 길이 == 도로의 길이] 같아 진다면
      } else if (road.size() + run == bridge_length) {
        // 맨 앞에 차 지우기
        road.remove();
        // 그 만큼 무게 제거
        trucks_weights -= road.remove();

        // 이 때 도로 위에 트럭이 올라 올 수 있는 무게라면
        if (trucks_weights + truck_weights[n] <= weight) {
          trucks_weights = roadOnTruck(truck_weights[n], trucks_weights, road);
        }
      } else {
        run++;
      }
    }

    /*
    -  -  -  -  - 10
    r   r  r  1  3   5  r  r  r  r     7
     */

    return minite + bridge_length - 1;
  }

  private static int roadOnTruck(Integer currTruck, int trucks_weights, Queue<Integer> road) {
    System.out.println(currTruck + "kg 트럭 입장");
    road.add(currTruck);
    trucks_weights += currTruck; // 도로 위 트럭 무게 저장
    System.out.println("도로 위 트럭 무게 = " + trucks_weights);
    return trucks_weights;
  }

  public static void main(String[] args) {
    System.out.println(
        solution(2, 10, new int[]{7, 4, 5, 6})
    );
  }
}

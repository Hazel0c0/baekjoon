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
    Queue<Integer> road = new LinkedList<>();
    Stack<Integer> truckStack = new Stack<>();
    for(int t:truck_weights){
      truckStack.add(t);
    }

    int minite = 0; // 초
    int trucks_weights = 0;
    int run = 0;

    while (truckStack.empty()) {
      minite++;
      Integer currTruck = truckStack.peek();
      System.out.println("minite = " + minite);
      if (road.isEmpty() || trucks_weights + currTruck <= weight) {
        trucks_weights = roadOnTruck(currTruck, trucks_weights, road, truckStack);
      } else if (road.size() == bridge_length) {
        road.remove();
        trucks_weights -= road.remove();
        if (road.peek() + currTruck < weight) {
          trucks_weights = roadOnTruck(currTruck, trucks_weights, road, truckStack);
        }
      } else if (road.size() + run == bridge_length) {
        road.remove();
        trucks_weights -= road.remove();
        if (road.peek() + currTruck < weight) {
          trucks_weights = roadOnTruck(currTruck, trucks_weights, road, truckStack);
        }
      } else {
        run++;
      }
    }

    return minite + bridge_length - 1;
  }

  private static int roadOnTruck(Integer currTruck, int trucks_weights, Queue<Integer> road, Stack<Integer> truckStack) {
    System.out.println(currTruck + "트럭 입장");
    trucks_weights += currTruck;
    road.add(truckStack.pop());
    System.out.println("trucks_weights = " + trucks_weights);
    return trucks_weights;
  }

  public static void main(String[] args) {
    System.out.println(
        solution(2, 10, new int[]{7, 4, 5, 6})
    );
  }

}

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    Queue<Integer> truck = new LinkedList<>(); // 트럭
    Queue<Integer> road = new LinkedList<>(); // 도로

    for (int t : truck_weights) {
      truck.add(t);
    }

    int minite = 0; // 초
    int trucks_weight = 0; // 도로 위 트럭들 무게

    while (!truck.isEmpty()) {
      minite++;
      int currTruck = truck.peek();

      // 도로 끝에 도착한 트럭들
      if (road.size() == bridge_length) {
        // 그 만큼 무게 제거
        Integer remove = road.remove();
        trucks_weight -= remove;
      }

        // [도로가 비었거나 || 도로 위 허용 가능 이하 무게 라면]
       if (road.isEmpty() || trucks_weight + currTruck <= weight) {
        road.add(currTruck);
        trucks_weight += truck.remove(); // 도로 위 트럭 무게 저장
      } else {
        // 도로에 트럭이 올라가지 못할 경우 빈 자리
        road.add(0);
      }
    }
    return minite + bridge_length;
  }
}
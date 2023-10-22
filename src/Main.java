import java.util.ArrayList;
import java.util.List;

public class Main {

  /*
  주차 요금 계산
  누적 주차 < 기본 시간(180분) (이하) - 기본 요금 청구(5000)
          >           (초과) - 기본 요금 + 담위 시간 당 요금(10분/ 600원)
   * 기본값 - 올림 / [a]: a보다 작지 않은 최소의 정수. 즉, 올림

   차량 번호가 작은 차 순으로 정렬, 주차 요금 리턴

   record : 시각 / 차량번호 / 내역
      시각 기준 오름차순
      출차 내역이 없다면 23:59분으로 간주

   */
  public static int[] solution(int[] fees, String[] records) {
    int[] answer = {};
    return answer;
  }

  public static void main(String[] args) {
    solution({180, 5000, 10, 600},
        new String[]
            {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT"
                , "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN"
                , "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});

  }


}

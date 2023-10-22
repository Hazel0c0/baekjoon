//package hash;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class 해시맵_주차요금계산 {
//  public static int[] solution(int[] fees, String[] records) {
//    int basicTime = fees[0];  // 기본 시간
//    int basicFee = fees[1];   // 기본 요금
//    int unitTime = fees[2];   // 단위 시간
//    int unitFee = fees[3];    // 초과 시 시간 당 요금
//
//    // 입출차 시간 <입, 출>
//    Map<String, String> inOutTimeMap = new HashMap<>();
//    // 주차 시간 <차 번호, 주차 시간>
//    Map<String, Integer> parkingTimeMap = new HashMap<>();
//
//    for (String record : records) {
//      String[] parts = record.split(" ");
//      String time = parts[0];
//      String carNum = parts[1];
//      String inOut = parts[2];
//
//      if (inOut.equals("IN")) {
//        inOutTimeMap.put(carNum, time);
//      } else if (inOut.equals("OUT")) {
//        String lastRecord = inOutTimeMap.get(carNum);
//
//        // 입출차 시간 → 총 주차 시간(분 단위)
//        int parkingTime = parkingTime(lastRecord, time);
//
//        parkingTimeMap.put(carNum, parkingTime);
//        inOutTimeMap.remove(carNum);
//      }
//    }
//    for (String carNumber : inOutTimeMap.keySet()) {
//      String lastRecord = inOutTimeMap.get(carNumber);
//      int parkingTime = parkingTime(lastRecord, "23:59");
//      parkingTimeMap.put(carNumber, parkingTimeMap.getOrDefault(carNumber, 0) + parkingTime);
//    }
//
//    List<Integer> feesList = new ArrayList<>();
//
//
//    for (String carNumber : parkingTimeMap.keySet()) {
//      int parkingTime = parkingTimeMap.get(carNumber);
//      int totalFee = calculateFee(parkingTime, basicTime, basicFee, unitTime, unitFee);
//      feesList.add(totalFee);
//    }
//
//    Collections.sort(feesList);
//
//    int[] result = new int[feesList.size()];
//    for (int i = 0; i < feesList.size(); i++) {
//      result[i] = feesList.get(i);
//    }
//
//    return result;
//  }
//
//  private static int parkingTime(String inTime, String outTime) {
//    String[] in = inTime.split(":");
//    String[] out = outTime.split(":");
//    int inHour = Integer.parseInt(in[0]);
//    int inMinute = Integer.parseInt(in[1]);
//    int outHour = Integer.parseInt(out[0]);
//    int outMinute = Integer.parseInt(out[1]);
//    return (outHour - inHour) * 60 + (outMinute - inMinute);
//  }
//
//  private static int calculateFee(int parkingTime, int basicTime, int basicFee, int unitTime, int unitFee) {
//    if (parkingTime <= basicTime) {
//      return basicFee;
//    } else {
//      return basicFee + (int) Math.ceil((double) (parkingTime - basicTime) / unitTime) * unitFee;
//    }
//  }
//
//
//  public static void main(String[] args) {
//    solution(new int[]{180, 5000, 10, 600},
//        new String[]
//            {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT"
//                , "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN"
//                , "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});
//  }
//
//}

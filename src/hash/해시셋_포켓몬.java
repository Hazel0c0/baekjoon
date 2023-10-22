package hash;

import java.util.HashSet;

public class 해시셋_포켓몬 {
  /*
  홍 박사님의 연구실의 N마리 포켓문 중 N/2마리를 가져도 된다.
  연구실의 포켓몬은 종류에 따라 번호를 붙여 구분한다. → 같은 종류 = 같은 번호
  당신은 N마리의 포켓몬의 종류 번호가 담긴 배열 `nums` 에서 최대한 많은 종류의 포켓몬을 가지길 원한다.
  포켓몬의 종류 개수를 return 하라.
   */
  public static int solution(int[] nums) {
    int maxPokemon = nums.length/2; // 가질 수 있는 포켓몬 수

    HashSet<Integer> pokemonSet = new HashSet<>();

    for(int num:nums){
      pokemonSet.add(num);
    }
    int pokemonKind = pokemonSet.size();

    return maxPokemon<pokemonKind?maxPokemon:pokemonKind;
  }
  public static void main(String[] args) {
    solution(new int[]{3, 3, 3, 2, 2, 4});
  }

}

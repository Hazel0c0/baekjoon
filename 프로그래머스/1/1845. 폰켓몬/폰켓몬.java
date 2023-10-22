import java.util.*;
class Solution {
    public int solution(int[] nums) {
 int maxPokemon = nums.length/2; // 가질 수 있는 포켓몬 수

    HashSet<Integer> pokemonSet = new HashSet<>();

    for(int num:nums){
      pokemonSet.add(num);
    }
    int pokemonKind = pokemonSet.size();

    return maxPokemon<pokemonKind?maxPokemon:pokemonKind;
    }
}
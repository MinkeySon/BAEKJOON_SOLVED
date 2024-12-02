package org.algorithm.solve.programmers.폰켓몬;

import java.util.*;

class Solution {
    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length / 2;

        for(int e : nums){
            if(!hashMap.containsKey(e)){
                hashMap.put(e, 1);
            }else{
                int value = hashMap.get(e);
                hashMap.put(e, value + 1);
            }
        }

        int mapSize = hashMap.size();

        if(N <= mapSize){
            answer = N;
        }else{
            answer = mapSize;
        }

        return answer;
    }
}

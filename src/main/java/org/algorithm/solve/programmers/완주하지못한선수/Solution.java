package org.algorithm.solve.programmers.완주하지못한선수;

import java.util.*;

class Solution {
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        for(String tmp : participant){
            hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
        }

        for(String tmp : completion){
            int value = hashMap.get(tmp);
            hashMap.put(tmp, value - 1);

            if(hashMap.get(tmp) == 0){
                hashMap.remove(tmp);
            }
        }

        for(String key : hashMap.keySet()){
            answer = key;
        }

        return answer;
    }
}

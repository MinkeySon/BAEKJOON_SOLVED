package org.algorithm.solve.programmers.의상;

import java.util.*;

class Solution {
    static HashMap<String, Integer> hm = new HashMap<>();

    public int solution(String[][] clothes) {
        int answer = 1;

        for(String[] e : clothes){
            hm.put(e[1], hm.getOrDefault(e[1], 0) + 1);
        }

        if(hm.size() == 1){
            for(String e : hm.keySet()){
                return hm.get(e);
            }
        }

        for(String e : hm.keySet()){
            answer = answer * (hm.get(e) + 1);
        }

        return answer - 1;
    }
}

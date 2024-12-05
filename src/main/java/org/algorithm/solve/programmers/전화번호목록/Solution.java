package org.algorithm.solve.programmers.전화번호목록;

import java.util.*;

class Solution {
    static HashMap<String, Integer> hm = new HashMap<>();

    public boolean solution(String[] phone_book) {

        for(String e : phone_book){
            hm.put(e, 1);
        }

        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(hm.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return true;
    }
}

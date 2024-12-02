package org.algorithm.solve.class3.BJ8375_패션왕신해빈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T != 0){
            int K = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for(int i=0; i<K; i++){
                String clothes = br.readLine();
                String[] arr = clothes.split(" ");

                String kind = arr[1];
                if(map.containsKey(kind)){
                    map.put(kind, map.get(kind) + 1);
                }else{
                    map.put(kind, 1);
                }
            }
            int result = 1;

            for(int v : map.values()){
                result *= v + 1;
            }
            sb.append(result - 1).append("\n");

            T--;
        }

        System.out.println(sb);
    }
}

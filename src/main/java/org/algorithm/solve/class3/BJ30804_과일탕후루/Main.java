package org.algorithm.solve.class3.BJ30804_과일탕후루;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        arr = new int[N];

        for(int i=0; i<N; i++){
            int v = Integer.parseInt(st.nextToken());
            arr[i] = v;
        }

        int left = 0;
        int max = 0;
        for(int right = 0; right < N; right++){
            hashMap.put(arr[right], hashMap.getOrDefault(arr[right], 0) + 1);

            while(hashMap.size() > 2){
                hashMap.put(arr[left], hashMap.get(arr[left]) - 1);

                if(hashMap.get(arr[left]) == 0){
                    hashMap.remove(arr[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}

package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1654_랜선자르기 {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine()," ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[K];

        long max = 0;

        for(int i=0; i<K; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            if(max < n){
                max = n;
            }
        }


        long min = 0;
        max ++;

        while(min < max){

            long mid = (max + min) / 2;

            long cnt = 0;

            for(int i=0; i<arr.length; i++){
                cnt += arr[i] / mid;
            }

            if(cnt < N){
                max = mid;
            }else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}

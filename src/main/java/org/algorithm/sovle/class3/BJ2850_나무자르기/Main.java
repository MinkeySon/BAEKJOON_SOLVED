package org.algorithm.sovle.class3.BJ2850_나무자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringTokenizer st;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new long[N];

        long max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            long e = Long.parseLong(st.nextToken());

            if (e > max) {
                max = e;
            }
            arr[i] = e;
        }

            long left = 0, right = max;
            long result = 0;

            while(left <= right){
                long mid = (left + right) / 2;
                long sum = 0;

                for(long e : arr){
                    if(e > mid){
                        sum += e - mid;
                    }
                }

                if(sum >= M){
                    result = mid;
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            System.out.println(result);
    }
}

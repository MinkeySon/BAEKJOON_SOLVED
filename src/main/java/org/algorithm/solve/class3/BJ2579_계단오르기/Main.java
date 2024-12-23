package org.algorithm.solve.class3.BJ2579_계단오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       N = Integer.parseInt(br.readLine());

       int[] DP = new int[N + 1];
       int[] arr = new int[N + 1];

       for(int i=1; i<=N; i++){
           arr[i] = Integer.parseInt(br.readLine());
       }

       DP[1] = arr[1];

       if(N>=2){
           DP[2] = arr[1] + arr[2];
       }

       for(int i=3; i<=N; i++){
           /**
            * 1. 현재 위치 + (현재 위치-3 + 현재위치 -2)
            * 2. 현재 위치 + (현재위치 - 3 + 현재위치 -1)
            */
           DP[i] = Math.max(DP[i-2], DP[i-3] + arr[i-1]) + arr[i];
       }
       System.out.println(DP[N]);
   }
}

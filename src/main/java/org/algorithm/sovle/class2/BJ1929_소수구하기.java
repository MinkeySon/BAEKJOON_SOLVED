package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1929_소수구하기 {
    static StringTokenizer st;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

         st = new StringTokenizer(input, " ");

         int M = Integer.parseInt(st.nextToken());
         int N = Integer.parseInt(st.nextToken());

         arr = new int[N+1];

        // 1부터 N까지 배열생성
         for(int i=1; i<=N; i++){
             arr[i] = i;
         }

         /**
         * T1) i = 2 -> j = 4 이고 2씩 증가한다. N까지 2씩 증가하는 j 의 값을 모두 0으로 지운다.
         * T2) i = 3 -> j = 6 이고 3씩 증가한다. N까지 3씩 증가하는 j 의 값을 모두 0으로 지운다.
          * 이렇게 특정 배수의 값들을 더 확실하고 촘촘하게 지울 수 있다.
         */
         for(int i=2; i<=N; i++){
             for(int j = i*2; j<=N; j+=i){
                 arr[j] = 0;
             }
         }

         StringBuilder sb = new StringBuilder();

        for(int i=M; i<=N; i++){
             if(arr[i] != 1 && arr[i] != 0){
                 sb.append(arr[i]).append("\n");
             }
         }

         System.out.println(sb);
    }
}

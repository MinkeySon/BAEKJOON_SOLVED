package org.algorithm.sovle.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N+1];

        st = new StringTokenizer(bf.readLine());
        for(int index=1; index<=N; index++){
            S[index] = S[index-1] + Integer.parseInt(st.nextToken());
        }

        for(int index=0; index<M; index++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(S[j]-S[i-1]);
        }
    }
}

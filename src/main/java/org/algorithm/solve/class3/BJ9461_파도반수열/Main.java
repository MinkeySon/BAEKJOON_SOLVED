package org.algorithm.solve.class3.BJ9461_파도반수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int T;
    static long[] arr = new long[101];
    public static void main(String[] args) throws IOException {
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;

        for(int i=6; i<= 100; i++){
            arr[i] = arr[i-1] + arr[i-5];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T != 0){
            int index = Integer.parseInt(br.readLine());

            sb.append(arr[index]).append("\n");
            T--;
        }
        System.out.println(sb);
    }
}

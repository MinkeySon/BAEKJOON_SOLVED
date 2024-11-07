package org.algorithm.sovle.class3.BJ11727_2xn타일링2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static long[] arr = new long[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 11;

        for(int i=5; i<=1000; i++){
            arr[i] = (arr[i-1] + (2 * arr[i-2])) % 10007;
        }
        System.out.println(arr[N]);
    }
}

package org.algorithm.sovle.class3.BJ11726_2xN타일링;

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
        arr[2] = 2;
        arr[3] = 3;

        for(int i=4; i<= 1000; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }

        System.out.println(arr[N] % 10007);
    }
}

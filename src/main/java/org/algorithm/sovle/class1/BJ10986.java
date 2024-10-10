package org.algorithm.sovle.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10986 {
    static int N,M;
    static int [] cnts;
    static int [] C;
    static BufferedReader input;
    static StringBuilder output = new StringBuilder();
    static StringTokenizer tokens;

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        tokens = new StringTokenizer(input.readLine()); // N,M 입력

        N = Integer.parseInt(tokens.nextToken());
        M = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(input.readLine()); // 배열 숫자 입력

        cnts = new int[N + 1];
        C = new int[M];
        long rst = 0;
        int tmp;

        for (int i = 1; i <= N; i++) {
            tmp = (cnts[i - 1] + Integer.parseInt(tokens.nextToken())) % M; // 나머지 연산 된 구간합

            cnts[i] = tmp;

            if (tmp == 0) { // self 구간합 나머지가 0일때
                rst++;
            }

            C[tmp]++; // 나머지가 같은 원소 개수 추가
        }

        for (long temp : C) {
            rst = rst + (temp * (temp-1) / 2);
        }
        System.out.println(rst);
    }

}

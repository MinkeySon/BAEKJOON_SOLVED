package org.algorithm.solve.class3.BJ11399_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static ArrayList<Integer> lst = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for(int i=1; i <= N; i++){
            lst.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(lst); // 정렬

        // 구간합 변환
        for(int i=1; i<=N-1; i++){
            int tmp = lst.get(i - 1) + lst.get(i);

            lst.set(i, tmp);
        }
        int sum = 0;
        for(int i=0; i<=N-1; i++){
            sum += lst.get(i);
        }

        System.out.println(sum);
    }
}

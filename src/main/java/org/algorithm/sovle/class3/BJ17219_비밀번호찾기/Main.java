package org.algorithm.sovle.class3.BJ17219_비밀번호찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static HashMap<String, String> map = new HashMap<>();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();
        st = new StringTokenizer(t, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            String input = br.readLine();
            st = new StringTokenizer(input, " ");

            map.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            String question = br.readLine();

            sb.append(map.get(question)).append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}

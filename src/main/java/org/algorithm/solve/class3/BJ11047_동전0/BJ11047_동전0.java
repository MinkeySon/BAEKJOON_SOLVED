package org.algorithm.solve.class3.BJ11047_동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ11047_동전0 {
    static int cnt = 0;
    static int N, K;
    static ArrayList<Integer> aList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            String a = br.readLine();

            aList.add(Integer.parseInt(a));
        }
        int size = aList.size();
        while(K!=0){
            for(int i = size -1 ; i >=0; i--){
                int a = aList.get(i);

                if(K - a >= 0){
                    K -= a;
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}

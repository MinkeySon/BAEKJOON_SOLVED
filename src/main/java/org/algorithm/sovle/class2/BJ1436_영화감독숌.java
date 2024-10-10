package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ1436_영화감독숌 {
    static int N;
    static int cnt = 1;
    static int title = 666;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        while(N!=cnt){
            title++;
            if(String.valueOf(title).contains("666")){
                cnt++;
            }
        }

        System.out.println(title);
    }
}

package org.algorithm.sovle.class2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1676_팩토리얼0의개수 {
    static int rst = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if(i % 5 == 0){
                rst ++;
            }
            if(i % 25 == 0){
                rst ++;
            }
            if(i % 125 == 0){
                rst ++;
            }
        }
        System.out.println(rst);
    }
}

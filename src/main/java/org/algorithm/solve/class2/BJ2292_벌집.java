package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2292_벌집 {
    static int index = 1;
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            while(index < N){
                index = index + cnt * 6;
                cnt++;
            }
            System.out.println(cnt);
        }
    }


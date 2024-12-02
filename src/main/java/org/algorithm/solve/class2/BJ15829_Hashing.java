package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ15829_Hashing {
    static int mod = 1234567891;
    static long pow = 1;
    static long rst = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();

        for(int i=0; i<input.length(); i++){
            int c = input.charAt(i);

            int aIndex = c - 96;
            rst = rst + aIndex * pow;

            pow = (pow * 31) % mod;
        }
        System.out.println(rst % mod);
    }
}




package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2231_분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Index = N-1;
        int result = 0;


        while(Index != 0){
            int tmp = Index;
            String SN = Integer.toString(Index);
            String[] list = SN.split("");

            for(int i=0; i<list.length; i++){ // 부루트포스 합
                tmp += Integer.parseInt(list[i]);
            }

            if(N == tmp){
                result = Index;
            }
            Index--; // 인덱스 감소
        }
        System.out.println(result);
    }
}

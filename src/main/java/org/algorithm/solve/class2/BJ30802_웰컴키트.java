package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author sonmingi
 * date 9/26/24
 * try : 4번
 * 조건문 잘 확인하기
 */

public class BJ30802_웰컴키트 {
    static int[] tList = new int[6];
    static int tResult=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<tList.length; i++){ // 사이즈 수량 배열 채우기
            int e = Integer.parseInt(st.nextToken());
            tList[i] = e;
        }

        st = new StringTokenizer(br.readLine(), " ");
        // T, P 입력 저장
        int T = Integer.parseInt(st.nextToken()); // 셔츠 묶음당 T개
        int P = Integer.parseInt(st.nextToken()); // 펜 P 묶음

        for(int tmp : tList){
            tResult += (tmp / T) + (tmp % T == 0 ? 0 : 1);
        }
        System.out.println(tResult); // T 출력 끝

        int penDivision = N / P;
        int penRemain = N % P;

        System.out.println(penDivision + " " + penRemain);
    }
}

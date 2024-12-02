package org.algorithm.solve.class1;

import java.util.*;

public class BJ10871 {

    public static void checkNumber(int M, int X){
        if (X>M){
            System.out.println(M);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N,X,M;
        // N, X 입력
        N = sc.nextInt(); // 배열 수
        X = sc.nextInt(); // 기준 되는 수

        for (int i=0; i<N; i++){
            M = sc.nextInt();
            checkNumber(M, X); // M이 X 보다 작을 시 출력 함수
        }
    }
}

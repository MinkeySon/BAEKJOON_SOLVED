package org.algorithm.sovle.class1;


import java.util.*;

public class BJ2475 {
    public static int getSquare(int n){
        return n * n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M, N;
        int sum = 0;

        for(int i=0; i<5; i++){ // 고유번호 입력 및 합 계산
            N = sc.nextInt();
            sum += getSquare(N);
        }

        M = sum % 10;

        System.out.println(M);
    }
}

package org.algorithm.sovle.class1;

import java.util.Scanner;

public class BJ2577_숫자의개수 {
    public static void main(String[] args){
        int[] score = {0,0,0,0,0,0,0,0,0,0}; // 0 ~ 9 까지 채점표

        Scanner sc = new Scanner(System.in); // A, B, C 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String result = Integer.toString(A * B * C); // 곱셈 값 저장
        String[] resultARY = result.split(""); // 배열에 결과 값 저장

        for(String tmp : resultARY){
            int index = Integer.parseInt(tmp);
            score[index] += 1;
        }
        for(int i : score){
            System.out.println(i);
        }
    }
}

package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ2052_나머지 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt=1; // 모두가 같은 숫자일 때를 생각해서 1

        int[] remainder = new int[10]; // 열자리 배열 생성

        for(int i=0; i<remainder.length; i++){ // 나머지 배열 생성
            int input = sc.nextInt();
            int N = input % 42;
            remainder[i] = N;
        }

        for(int j=0; j<remainder.length; j++){ // 브루트포스로 탐색
            for(int k=j+1; k<remainder.length; k++){
                if(remainder[j] == remainder[k]){ // 같은 나머지 일 경우에는 바로 다음 인덱스 탐색
                    break;
                }
                if(k==9){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

package org.algorithm.solve.class1;

import java.util.Scanner;

/**
 * 2024.09.25 다시 풀어보기
 */

public class BJ10250_ACM호텔 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 횟수 입력
        int H,W,N;
        int cnt=0;
        String W_NUMBER="";
        String H_NUMBER="";
        sc.nextLine();
        for(int i=0; i<T; i++){ // 테스트 케이스만큼 반복
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();
            sc.nextLine();
            cnt = 0;
            for(int j=1; j<=W; j++){// 방 수만큼 반복
                for(int k=1; k<=H; k++){ // 층 수 만큼 반복
                    cnt++;
                    if(cnt == N){
                        H_NUMBER = Integer.toString(k);
                        if(j<10){
                            W_NUMBER = "0" + j;
                        }else{
                            W_NUMBER = Integer.toString(j);
                        }
                        String R_NUMBER = H_NUMBER + W_NUMBER;
                        System.out.println(R_NUMBER);
                        break;
                    }
                }
                if(cnt==N) break;
            }
        }

    }
}

package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 그리디 알고리즘
 */
public class BJ2839_설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 0이 될때까지 반복
        while(N != 0){
            // N이 5와 3의 공배수가 아닐경우
            if(N % 3 == 0 && N % 5 == 0){
                cnt++;
                N -= 5;
            }
            // 3의 배수가 아닐경우
            else if(N % 3 == 0){
                cnt ++;
                N -= 3;
                // 5의 배수가 아닐 경우
            } else if (N % 5 == 0) {
                cnt ++;
                N -= 5;
            }else{
                N -= 5; // 둘 다 안나눠 진다? ex) 11. 일단 5를 빼
                if(N<0){ // 딱 맞게 나눌 수가 없는 수
                    cnt = -1;
                    break;
                }else{
                    cnt++;
                }
            }
        }
        System.out.println(cnt); // 최종 출력
    }
}

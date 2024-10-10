package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ2775_부녀회장이될테야 {
    static int T;
    static int K;
    static int N;
    static int howMany(int K, int N){ // 호실 인원 찾는 함수
        if(K == 0){ // 1층 일 땐 N명 고정
            return N;
        }else if(N == 1){ // 1호 일 땐 1명 고정
            return 1;
        }else{
            return howMany(K, N-1) + howMany(K-1, N);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

        while(T!=0){ // 테스트 케이스 만큼 반복
            // K, N 입력
            K = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());

            System.out.println(howMany(K,N)); // 함수 호출
            T--;
        }
    }
}

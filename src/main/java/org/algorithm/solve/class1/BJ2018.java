package org.algorithm.solve.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2018 {
    static int N;
    static int[] A;
    static BufferedReader input;
    static StringTokenizer token;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        token = new StringTokenizer(input.readLine());

        N = Integer.parseInt(token.nextToken()); // int N 입력

        A = new int[N+1];

        for(int i=1; i<=N; i++){ // 배열생성
            A[i] = i;
        }

        int rst = 0;
        int cnt = 0;

        for(int i=1; i<=N; i++){
            rst += A[i];
            if(rst == N){ // 시작 인덱스가 N 일때 반복 멈춤
                cnt += 1;
                break;
            }
            for(int j=i+1; j<=N; j++){ // 다음 인덱스 rst 에 더하기
                rst += A[j];

                if(rst == N){ // 합이 N일 경우, cnt +1
                    cnt += 1;
                    break;
                }else if(rst > N){ // 합이 N보다 커질 경우 시작 인덱스 옮기기
                    rst = 0;
                    break;
                }else{ // 아직 N에 도달하지 못하면 계속
                    continue;
                }
            }
        }
        System.out.println(cnt);
    }
}

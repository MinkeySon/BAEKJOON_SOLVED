package org.algorithm.sovle.class2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11651_좌표정렬하기3 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
            int N = Integer.parseInt(br.readLine());

            int[][] ary = new int[N][2];

            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine(), " ");

                ary[i][0] = Integer.parseInt(st.nextToken()); // x좌표 입력
                ary[i][1] = Integer.parseInt(st.nextToken()); // y좌표 입력
            }

            br.close();

            // Arrays.sort() 람다식 구현

            Arrays.sort(ary, (e1,e2) ->{
                if(e1[1] == e2[1]){
                    return e1[0] - e2[0]; // y 좌표가 같을 때, x 좌표 대조
                }else {
                    return e1[1] - e2[1]; // y 좌표가 다르면? y 좌표 기준으로 정렬
                }
            });

            StringBuilder sb = new StringBuilder();

            for(int i=0; i<N; i++){
                sb.append(ary[i][0]).append(" ").append(ary[i][1]).append("\n");
            }
            System.out.println(sb);
    }
}

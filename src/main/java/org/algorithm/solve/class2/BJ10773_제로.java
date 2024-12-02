package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<K; i++){
            int N = Integer.parseInt(br.readLine());

            if(N == 0){
                sum = sum - s.pop();
            }else{
                s.push(N);
                sum = sum + N;
            }
        }

        System.out.println(sum);
    }
}

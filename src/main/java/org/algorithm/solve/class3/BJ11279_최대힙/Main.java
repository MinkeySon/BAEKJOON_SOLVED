package org.algorithm.solve.class3.BJ11279_최대힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String input = br.readLine();

            if(input.equals("0")){
                if(maxHeap.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(maxHeap.poll()).append("\n");
                }
            }else{
                maxHeap.add(Integer.parseInt(input));
            }
        }
        System.out.println(sb);

    }
}

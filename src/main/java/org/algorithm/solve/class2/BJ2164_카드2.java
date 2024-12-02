package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class BJ2164_카드2 {

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i<=N; i++) { // q 채우기
            q.offer(i);
        }

        while (q.size() != 1) { // 하나의 원소만 남을때까지
            q.poll(); // 맨 앞 삭제
            q.offer(q.poll()); // 그 다음 인덱스 삭제 후 맨 뒤에 추가
        }
        System.out.println(q.poll());
    }
}

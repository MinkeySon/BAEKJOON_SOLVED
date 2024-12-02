package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M=0;
        int sum=0;

        for(int i=0; i<N; i++){
            int score = sc.nextInt();

            if(M < score){
                M = score;
            }

            sum += score;
        }

        float avg = ((float)sum / M / N) * 100;

        System.out.println(avg);
        sc.close();
    }
}

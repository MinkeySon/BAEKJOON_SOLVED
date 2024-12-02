package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ2439_별찍기 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=N; i>0; i--){
            String gap = " ".repeat(i-1);
            String star = "*".repeat(N-(i-1));
            System.out.println(gap + star);
        }
    }
}

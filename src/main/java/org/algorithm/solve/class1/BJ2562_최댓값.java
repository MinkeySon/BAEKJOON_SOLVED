package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ2562_최댓값 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max, index, n;
        max =0;
        index =0;
        for(int i=1; i<=9; i++){
            n = sc.nextInt();
            if(n > max){
                max = n;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}

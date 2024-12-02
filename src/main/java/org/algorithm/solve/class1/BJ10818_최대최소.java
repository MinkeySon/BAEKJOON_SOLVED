package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ10818_최대최소 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max, min;
        int N = sc.nextInt();
        sc.nextLine();
        int startNumber = sc.nextInt();
        max = startNumber;
        min = startNumber;

        for(int i=1; i<N; i++){
            int tmp = sc.nextInt();
            if(tmp > max){
                max = tmp;
            }
            if(tmp < min){
                min = tmp;
            }
        }
        System.out.println(min + " " +max);
        sc.close();
    }
}

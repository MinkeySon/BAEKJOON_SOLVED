package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ27866_문자와문자열 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int i = sc.nextInt();
        i -=1;

        System.out.println(s.charAt(i));
    }
}

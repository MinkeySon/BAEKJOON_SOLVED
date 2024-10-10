package org.algorithm.sovle.class1;

import java.util.Scanner;

public class BJ11654_아스키코드 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = s.charAt(0);
        int ascii = (int)c;
        System.out.println(ascii);
    }
}

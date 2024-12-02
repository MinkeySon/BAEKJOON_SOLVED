package org.algorithm.solve.class1;


import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String number = sc.next();

        char[] c = number.toCharArray();
        int sum= 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i] - '0';
        }

        System.out.println(sum);
        sc.close();
    }
}

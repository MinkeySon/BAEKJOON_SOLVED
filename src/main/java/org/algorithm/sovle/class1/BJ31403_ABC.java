package org.algorithm.sovle.class1;
import java.util.Scanner;
public class BJ31403_ABC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A,B,C;
        A = sc.nextLine();
        B = sc.nextLine();
        C = sc.nextLine();

        String AB = A+B;

        int result1 = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        int result2 = Integer.parseInt(AB) - Integer.parseInt(C);
        System.out.println(result1);
        System.out.println(result2);
    }
}

package org.algorithm.sovle.class1;

import java.io.IOException;
import java.util.*;

public class BJ10950 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] A = new String[2];

        while(true){
            A = sc.nextLine().split(" ");
            if(A[0].equals("0")&&A[1].equals("0")){
                break;
            }else {
                System.out.println(Integer.parseInt(A[0]) + Integer.parseInt(A[1]));
            }
        }
    }
}

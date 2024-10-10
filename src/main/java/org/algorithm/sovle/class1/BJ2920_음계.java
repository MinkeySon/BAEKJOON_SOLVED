package org.algorithm.sovle.class1;

import java.util.Scanner;

public class BJ2920_음계 {
    static StringBuffer sb;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String scale = "1 2 3 4 5 6 7 8"; // ascending 음계
        sb = new StringBuffer(scale);
        String reverseScale = sb.reverse().toString(); // descending 음계

        String input = sc.nextLine();
        sb = new StringBuffer(input);

        if(input.equals(scale)){
            System.out.println("ascending");
        }else if(input.equals(reverseScale)){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}

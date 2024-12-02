package org.algorithm.solve.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1152_단어의개수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String FULL_SENTENCE = sc.nextLine();
        String[] SPLIT_ARY = FULL_SENTENCE.split(" ");

        SPLIT_ARY = Arrays.stream(SPLIT_ARY)
                        .filter(factor -> !factor.equals(""))
                        .toArray(String[]::new);

        System.out.println(SPLIT_ARY.length);
    }
}

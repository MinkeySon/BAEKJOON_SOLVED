package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 숫자를 찾아내는 로직이 중요함.
 */
public class BJ28702_FizzBuzz {

    static boolean isNum(String input){
        return input.chars().allMatch(Character::isDigit);
    }

    static int N = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++){
            String input = br.readLine();
            if(isNum(input)){
                N = Integer.parseInt(input);
                N += 3-i;
            }
        }

        if(N % 3 == 0 && N % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(N % 3 == 0){
            System.out.println("Fizz");
        }else if(N % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(N);
        }
    }

}

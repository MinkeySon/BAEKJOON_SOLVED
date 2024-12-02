package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ4949_균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;


        while(true){
            input = br.readLine();

            if(input.equals(".")){
                br.close();
                break;
            }

            boolean check = true;
            Stack<Character> s = new Stack<>();

            for(char tmp : input.toCharArray()) {
                if (tmp == '(' || tmp == '[') {
                    s.push(tmp);
                } else if (tmp == ')') {
                    if (s.isEmpty() || s.peek() != '(') {
                        check = false;
                        break;
                    } else {
                        s.pop();
                    }
                } else if(tmp == ']'){
                        if(s.isEmpty() || s.peek() != '['){
                            check = false;
                            break;
                        } else{
                            s.pop();
                        }
                    }
                }
            if(check && s.isEmpty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        br.close();
    }
}

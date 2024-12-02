package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ9021_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String input = br.readLine();
            Stack<Character> s = new Stack<>();
            boolean check = true;
            for(char e : input.toCharArray()){
                // ( 일때 스택 push
                if(e == '('){
                    s.push(e);
                }else{ // ) 일때
                    if(s.isEmpty()){
                        // NO 를 출력하고
                        check = false;
                        break;
                    } else if(s.peek() == '('){
                        s.pop();
                    }
                }
            }
            // 다 순회 했을 때 스택이 비어있지 않으면 NO
            if(!check || s.size() > 0){
               System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}

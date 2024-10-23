package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ1966_프린터큐 {
    static StringTokenizer st;
    static int p;
    static int index;
    static ArrayList<Boolean> check;
    static ArrayList<Integer> queue;
    static void pop(){
        if(queue.size() > 0){
            queue.remove(0);
            check.remove(0);
        }
    }
    static void goToBehind(){
        int e = queue.remove(0);
        boolean b = check.remove(0);
        queue.add(e);
        check.add(b);
    }
    static void convertQueue(String input, int index){
        String[] inputArr = input.split(" ");
        queue = new ArrayList<>();
        check = new ArrayList<>();

        for(int i=0; i< inputArr.length; i++){
            int e = Integer.parseInt(inputArr[i]);
            queue.add(e);
            if(index == i){
                check.add(true);
            }else{
                check.add(false);
            }
        }
    }

    static int verify(){
        int cnt = 0;

        while(!queue.isEmpty()){
            int max = Collections.max(queue);

            if((queue.get(0) == max) && check.get(0)){
                cnt++;
                break;
            }

            else if(queue.get(0) == max){
                pop();
                cnt++;
            }else{
                goToBehind();
            }
        }
        return cnt;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T != 0){
            String attr = br.readLine();
            st = new StringTokenizer(attr," ");

            p = Integer.parseInt(st.nextToken());
            index = Integer.parseInt(st.nextToken());
            String input = br.readLine();

            if(input.length() == 1){
                sb.append(1).append("\n");
            }else{
                convertQueue(input, index);

                int result = verify();
                sb.append(result).append("\n");
            }

            T--;
        }
        br.close();
        System.out.println(sb);
    }
}

package org.algorithm.solve.class3.BJ11723_나는야포켓몬마스터이다솜;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ1620_나는야포켓몬마스터이다솜 {
    static int N,M;
    static HashMap<String, Integer> nameMap = new HashMap<>();
    static HashMap<Integer, String> numberMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i =1; i<=N; i++){
            String pocketmonName = br.readLine();
            nameMap.put(pocketmonName,i);
            numberMap.put(i,pocketmonName);
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<M; j++){
            String question = br.readLine();

            if(question.chars().allMatch(Character::isDigit)){
                sb.append(numberMap.get(Integer.parseInt(question))).append("\n");
            }else{
                sb.append(nameMap.get(question)).append("\n");
            }
        }
        System.out.println(sb);
    }
}

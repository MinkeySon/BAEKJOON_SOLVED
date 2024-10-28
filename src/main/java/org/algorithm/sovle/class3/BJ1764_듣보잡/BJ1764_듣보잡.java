package org.algorithm.sovle.class3.BJ1764_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ1764_듣보잡 {
    static int N;
    static int M;
    static HashMap<String, String> map = new HashMap<>();
    static ArrayList<String> resultList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            String dPerson = br.readLine();
            map.put(dPerson, dPerson);
        }

        for(int j=0; j<M; j++){
            String bPerson = br.readLine();
            if(map.containsKey(bPerson)){
                resultList.add(bPerson);
            }
        }

        Collections.sort(resultList);

        StringBuilder sb = new StringBuilder();
        sb.append(resultList.size()).append("\n");
        for(String e : resultList){
            sb.append(e).append("\n");
        }

        System.out.println(sb);
    }
}

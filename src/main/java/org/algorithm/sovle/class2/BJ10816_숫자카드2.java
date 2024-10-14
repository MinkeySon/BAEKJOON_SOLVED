package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10816_숫자카드2 {
    static int[] poAR;
    static int[] neAR;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        poAR = new int[10_000_001];
        neAR = new int[10_000_001];

        String myCard = br.readLine();
        String[] myCardARY = myCard.split(" ");

        for (String e : myCardARY){
            int tmp = Integer.parseInt(e);

            if(tmp < 0){
                neAR[Math.abs(tmp)] ++;
            }else{
                poAR[tmp] ++;
            }
        }

        int M = Integer.parseInt(br.readLine());

        String corCard = br.readLine();
        String[] corCardARY = corCard.split(" ");
        StringBuilder sb = new StringBuilder();

        br.close();
        for(String e : corCardARY){
            int tmp = Integer.parseInt(e);

            if(tmp < 0){
                sb.append(neAR[Math.abs(tmp)]).append(" ");
            }else{
                sb.append(poAR[tmp]).append(" ");
            }
        }
        System.out.println(sb);
    }
}

package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869_달팽이는올라가고싶다 {
    static int V, A, B;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        st = new StringTokenizer(input, " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        if(A > V){
            System.out.println(1);
        }else{
            int m = (V-A) % (A-B);
            int q = (V-A) / (A-B);

            if(m == 0){
                System.out.println(q + 1);
            }else{
                System.out.println(q + 2);
            }
        }
    }
}

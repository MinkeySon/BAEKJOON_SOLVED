package org.algorithm.sovle.class3.BJ2630_색종이만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,white,blue;
    static int[][] arr;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];

        for(int i=1; i<= N; i++){
            String input = br.readLine();
            st = new StringTokenizer(input, " ");
            for(int j=1; j<= N; j++){
                int e = Integer.parseInt(st.nextToken());

                arr[i][j] = e;
            }
        }

        count(1,1, N);
        sb.append(white).append("\n");
        sb.append(blue).append("\n");
        System.out.println(sb);
    }

    static void count(int row, int column, int size){
        if(checkColor(row, column, size)){
            if(arr[row][column] == 0){
                white ++;
            }else{
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        count(row, column, newSize);
        count(row, column + newSize, newSize);
        count(row + newSize, column, newSize);
        count(row + newSize, column + newSize, newSize);
    }
    static boolean checkColor(int row, int column, int size) {
        int firstColor = arr[row][column];

        for(int i=row; i<=row+size-1; i++){
            for(int j=column; j<=column+size-1; j++){
                if(arr[i][j] != firstColor){
                    return false;
                }
            }
        }
        return true;
    }
}

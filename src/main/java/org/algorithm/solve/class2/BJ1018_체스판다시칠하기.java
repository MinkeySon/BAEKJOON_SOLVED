package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1018_체스판다시칠하기 {
    static boolean[][] chess;
    static int min = 64; // 나올 수 있는 가장 최대 값은 8*8

    static int compare(int r, int c) { // 비교하는 함수
        int ROW_END = r + 8;
        int COLUMN_END = c + 8;
        int count = 0;

        boolean color = chess[r][c]; // 처음 색깔

        for (int i = r; i < ROW_END; i++) {
            for (int j = c; j < COLUMN_END; j++) {

                if (chess[i][j] != color) {
                    count++;
                }
                color = !color; // 다음 색깔에 와야 하는 애랑 일치하는지 비교하기 위해 not 연산
            }
            color = !color; // 다음 줄 첫번째 not 연산
        }

        /**
         * 1. W -> B 로 바꾸는 경우
         * 2. B -> W 로 바꾸는 경우
         * 2가지 경우의 count 가 다르기 때문에 역 비교를 해줘야함.
         */
        int reverseCount = 64 - count;

        if(count < reverseCount){
            return count;
        }else{
            return reverseCount;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputNum = br.readLine();
        StringTokenizer st = new StringTokenizer(inputNum, " ");

        int row = Integer.parseInt(st.nextToken()); // column
        int column = Integer.parseInt(st.nextToken()); // row

        chess = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            String input = br.readLine();
            String[] inputAry = input.split("");
            for (int j = 0; j < column; j++) {
                if (inputAry[j].equals("W")) {
                    chess[i][j] = true;
                } else {
                    chess[i][j] = false;
                }
            }
        }

        br.close();

        int ROW_START_INDEX = row - 7; // 1
        int COLUMN_START_INDEX = column - 7; // 1

        for (int i = 0; i < ROW_START_INDEX; i++) {
            for (int j = 0; j < COLUMN_START_INDEX; j++) {
                int tmp = compare(i, j);

                if (tmp < min) {
                    min = tmp;
                }
            }
        }
        System.out.println(min);
    }
}
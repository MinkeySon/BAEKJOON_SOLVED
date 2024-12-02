package org.algorithm.solve.class3.BJ21736_헌내기는친구가필요해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] rowMove = {1,-1,0,0};
    static int[] colMove = {0,0,1,-1};
    static int currentRow, currentCol;
    static boolean[][] checkMap;
    static StringTokenizer st;
    static int N, M;
    static String[][] map;
    static int count;
    static class Node{
        int row;
        int col;
        public Node(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new String[N][M];
        checkMap = new boolean[N][M];

        for(int i=0; i<N; i++){
            String input = br.readLine();
            String[] inputArr = input.split("");
            for(int j=0; j<M; j++){
                if(inputArr[j].equals("I")){
                    currentRow = i;
                    currentCol = j;
                }

                map[i][j] = inputArr[j];
            }
        }
        Node node = new Node(currentRow, currentCol);

        DFS(node);

        if(count == 0){
            System.out.println("TT");
        }else{
            System.out.println(count);
        }
    }
    static void DFS(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            Node n = stack.pop();
            checkMap[n.row][n.col] = true;
            currentRow = n.row; currentCol = n.col;

            for(int i=0; i<4; i++){
                int addRow = currentRow + rowMove[i];
                int addCol = currentCol + colMove[i];

                if(isOkay(addRow, addCol) && !checkMap[addRow][addCol]){
                    stack.push(new Node(addRow,addCol));
                    checkMap[addRow][addCol] = true;

                    if(map[addRow][addCol].equals("P")){
                        count++;
                    }
                }
            }
        }
    }

    static boolean isOkay(int row, int col){
        return row < N && col < M && row >= 0 && col >= 0 && !map[row][col].equals("X");
    }
}

package org.algorithm.solve.class1;

import java.util.Scanner;

public class BJ8958_OX퀴즈 {
    static String[] inputList;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int score = 1;

        for(int i=0; i<T; i++){
            // 테스트케이스 하나 끝나면 결과, score 리셋
            int result = 0;
            score = 1;

            // 입력 받은 문자 길이 + 1 배열 생성
            String input = sc.next();
            inputList = new String[input.length()+1];
            // 가점 score 생기지 않게끔 처음 0 인덱스는 X 로 고정
            inputList[0] = "X";

            // 맨 앞 인덱스에 X 공간 생성한 배열
            for(int k=0; k<inputList.length-1; k++){
                inputList[k+1] = String.valueOf(input.charAt(k));
            }

            for(int j=1; j<inputList.length; j++){
                if(inputList[j].equals("X")){ // X 일때
                    score = 1; // X면 스코어 초기화
                    continue;
                }else{ // O 일때
                    if(inputList[j-1].equals("O")){
                        score ++; // 전에 O 였으면 스코어 증가
                        result += score;
                    }else{
                        result ++;
                    }
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}

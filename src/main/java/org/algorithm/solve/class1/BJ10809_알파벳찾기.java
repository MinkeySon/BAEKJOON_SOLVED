package org.algorithm.solve.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BJ10809_알파벳찾기 {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] score = new int[alphabet.length()];
        Arrays.fill(score, -1); // -1 로 배열 초기화

        String S = sc.next(); // 단어 입력
        String[] SList = S.split(""); // 단어 배열화

        for(int i=0; i<SList.length; i++){
            String W = SList[i];
            int index = alphabet.indexOf(W); // score 알파벳 배열 위치 확인
            if(score[index] != -1){ // 중복되는 알파벳은 값 증가 패스
                continue;
            }
            score[index] = i;
        }

        StringBuilder sb = new StringBuilder();

        for(int tmp : score){
            sb.append(tmp).append(" ");
        }
        System.out.println(sb.toString());
    }
}

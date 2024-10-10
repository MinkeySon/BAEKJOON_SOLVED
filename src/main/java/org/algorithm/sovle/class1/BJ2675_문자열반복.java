package org.algorithm.sovle.class1;

import java.util.Scanner;

public class BJ2675_문자열반복 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            StringBuilder result = new StringBuilder();
            sc.nextLine();
            int R = sc.nextInt(); // 반복 횟수 입력
            String S = sc.next(); // 반복 문자 입력

            String[] S_ARY = S.split(""); // 입력한 S 배열로 쪼개기

            for(int j=0; j<S_ARY.length; j++){
                result.append(S_ARY[j].repeat(R)); // 각 문자 반복 후 붙이기
            }
            System.out.println(result); // 결과 값 출력
        }
        sc.close();
    }
}

package org.algorithm.sovle.class3.BJ1927_최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int T;
    static ArrayList<Integer> minHeap = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while(T != 0){
            String input = br.readLine();

            if(input.equals("0")){
                int result = pop();
                sb.append(result).append("\n");
            }else{
                push(Integer.parseInt(input));
            }
            T--;
        }

        System.out.println(sb);
    }

    static int pop(){
        if(!minHeap.isEmpty()){
            int top = minHeap.get(0);

            int lastIndex = minHeap.size() - 1;
            minHeap.set(0, minHeap.get(lastIndex));
            minHeap.remove(lastIndex);

            int i = 0;
            while(true){
                int leftChildIndex = i * 2 + 1;
                int rightChildIndex = i * 2 + 2;
                int topIndex = i;

                // 왼쪽 자식이 존재하고, 왼쪽 자식이 더 작으면 smallestIndex 업데이트
                if (leftChildIndex < minHeap.size() && compare(topIndex, leftChildIndex)) {
                    topIndex = leftChildIndex;
                }

                // 오른쪽 자식이 존재하고, 오른쪽 자식이 더 작으면 smallestIndex 업데이트
                if (rightChildIndex < minHeap.size() && compare(topIndex, rightChildIndex)) {
                    topIndex = rightChildIndex;
                }

                if (topIndex == i){
                    break;
                }

                swap(i, topIndex);
                i = topIndex;
            }

            return top;
        }else{
            return 0;
        }
    }

    static void push(int x){
        minHeap.add(x);

        int currentIndex = minHeap.size() - 1;
        while(currentIndex > 0){
            int parentIndex = (currentIndex - 1) / 2;
            if(compare(parentIndex, currentIndex)){
                swap(parentIndex, currentIndex);
                currentIndex = parentIndex;
            }else{
                break;
            }
        }
    }

    static boolean compare(int top, int child){
        return minHeap.get(top) > minHeap.get(child);
    }

    static void swap(int top, int child){
        int tmp = minHeap.get(top);
        minHeap.set(top, minHeap.get(child));
        minHeap.set(child, tmp);
    }
}

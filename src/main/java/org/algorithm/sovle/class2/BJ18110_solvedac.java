package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ18110_solvedac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        int n = Integer.parseInt(br.readLine());
        int cut = (int) Math.round(n * 0.15);

        List<Integer> list = new ArrayList<>();

        for (int a=0; a<n; a++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        int size = n - (cut * 2);

        for (int a=cut; a<size+cut; a++) {

            result += list.get(a);
        }

        result = (int) Math.round((double) result / size);
        System.out.println(result);
    }
}
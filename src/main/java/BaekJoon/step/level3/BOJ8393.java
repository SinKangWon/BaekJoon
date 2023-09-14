package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8393 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int y = n;
        for (int l = 1; l <= y-1; l++) {
            n += l;
        }
        System.out.println(n);

    }
}
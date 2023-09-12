package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2739 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int l = 1; l <= 9; l++) {
            System.out.println(n + " * " + l + " = " + (n * l));
        }
    }
}

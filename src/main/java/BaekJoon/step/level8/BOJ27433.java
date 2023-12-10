package BaekJoon.step.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        long result = 1;
        for (long i = N; i > 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}

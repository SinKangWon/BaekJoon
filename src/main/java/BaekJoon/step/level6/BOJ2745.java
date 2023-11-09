package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] BN = reader.readLine().split(" ");
        String B = BN[0];
        int N = Integer.parseInt(BN[1]);

        int a = Integer.parseInt(B, N);

        System.out.println(a);
    }
}

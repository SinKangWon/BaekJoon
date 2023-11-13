package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int result = (int) Math.pow((Math.pow(2, N) + 1),2);

        System.out.println(result);
    }
}

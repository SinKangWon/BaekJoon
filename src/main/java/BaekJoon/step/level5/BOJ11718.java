package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        while ((input = reader.readLine()) != null) {
            sb.append(input).append("\n");
        }
        System.out.print(sb);
    }
}

package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NB = reader.readLine().split(" ");
        reader.close();
        int N = Integer.parseInt(NB[0]);
        int B = Integer.parseInt(NB[1]);
        int remainder;

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            remainder = N % B;
            if (remainder >= 10) {
                char remainderToChar = (char) (remainder + 55);
                sb.append(remainderToChar);
            } else {
                sb.append(remainder);
            }
            N /= B;
        }

        System.out.println(sb.reverse());
    }
}
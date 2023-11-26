package BaekJoon.step.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String result = "";
        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }

            int a = 1;
            result = n + " = " + 1;
            for (int i = 1; i < n; i++) {
                if (n % i == 0 && i > 1) {
                    a += i;
                    result += " + " + i;
                }
            }

            if (n == a) {
                System.out.println(result);
            }
            else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}

package BaekJoon.step.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String result = "";
        while (rest(N) > 1) {
            result += rest(N) + "\n";
            N = N / rest(N);
        }

        System.out.println(result);
    }

    static int rest(int N) {
        int result = 0;
        for (int i = 2; i <= N; i++) {
            if (N % i < 1)
            {
                result = i;
                break;
            }
        }
        return result;
    }
}

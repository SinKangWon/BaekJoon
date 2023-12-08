package BaekJoon.step.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        int sum = 0;
        String st = "";
        for (int i = M; i <= N; i++) {
            if (!find(i)) {
                sum += i;
                st += i + " ";
            }
        }
        String[] arr = st.split(" ");
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + arr[0]);
        }
    }

    static boolean find(int a) {
        boolean result = false;
        if (a == 1)
        {
            result = true;
        } else if (a == 2) {
            result = false;
        } else
        {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    result = true;
                    break;
                }
            }
        }
        return result;
        }
}

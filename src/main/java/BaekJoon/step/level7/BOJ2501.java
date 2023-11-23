package BaekJoon.step.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String stringArray = "";
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                stringArray += i + " ";
            }
        }


        String[] arr = stringArray.split(" ");

        if (K - arr.length <= 0) {
            System.out.println(arr[K - 1]);
        } else {
            System.out.println(0);
        }
    }
}

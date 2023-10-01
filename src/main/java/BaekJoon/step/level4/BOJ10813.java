package BaekJoon.step.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] baskets = new int[N];

        for (int n = 0; n < N; n++) {
            baskets[n] = n + 1;
        }

        for (int n = 0; n < M; n++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int bowl = 0;
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            bowl = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = bowl;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int n = 0; n < N; n++) {
            stringBuilder.append(baskets[n]);
            if (n < N - 1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}

package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(reader.readLine());

        int graphNum = 1; // 대각선 번호
        int count = 1;
        int max = 2;

        while (N >= count) {
            if (count >= max) {
                graphNum += 1;
                max = max + graphNum;
            }
            count += 1;
        }

        int x;
        int y;
        if (graphNum % 2 == 0) {
            x = 1;
            y = graphNum;
            for (int i = max-graphNum; i < N; i++) {
                x += 1;
                y -= 1;
            }
            } else {
            x = graphNum;
            y = 1;
            for (int i = max-graphNum; i < N; i++) {
                x -= 1;
                y += 1;
            }
        }
        System.out.println(x + "/" + y);
    }
}

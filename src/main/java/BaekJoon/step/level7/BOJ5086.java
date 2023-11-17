package BaekJoon.step.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        StringBuilder result = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if (f == 0 && s == 0) {
                break;
            }

            if (f % s == 0) {
                result.append("multiple").append("\n");
            } else if (s % f == 0) {
                result.append("factor").append("\n");
            } else {
                result.append("neither").append("\n");
            }

        }

        System.out.println(result);
    }
}

package BaekJoon.step.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String[] student = new String[30];

        for (int i = 1; i < 31; i++) {
            student[i - 1] = String.valueOf(i);
        }
        for (int i = 1; i < 29; i++) {
            int studentNum = Integer.parseInt(reader.readLine());
            student[studentNum - 1] = "O";
        }
        for (int i = 0; i < student.length; i++) {
            if (!student[i].equals("O")) {
                result.append(i + 1).append(" ");
            }
        }
        System.out.println(result);
    }
}

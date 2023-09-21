package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number; i++) {
            for (int j = number - 1; j > i; j--) {
                writer.write(" ");
            }
            for (int j = 0; j <= i; j++) {
                writer.write("*");
            }
            writer.write("\n");
        }
        writer.flush();
        reader.close();
        writer.close();


    }
}
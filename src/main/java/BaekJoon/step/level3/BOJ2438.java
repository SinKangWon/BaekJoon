package BaekJoon.step.level3;

import java.io.*;

public class BOJ2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int starQuantity = Integer.parseInt(reader.readLine());
        String star = "";

        for (int i = 0; i < starQuantity; i++) {

            star = star + "*";

            writer.write(star + "\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}

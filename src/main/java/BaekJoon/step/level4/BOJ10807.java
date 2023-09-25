package BaekJoon.step.level4;

import java.io.*;

public class BOJ10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int listQuantity = Integer.parseInt(reader.readLine());
        String list = reader.readLine();
        String[] array = list.split(" ");
        String key = reader.readLine();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
            count += 1;
            }
        }
        writer.write(Integer.toString(count));
        writer.flush();
        reader.close();
        writer.close();
    }
}

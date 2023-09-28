package BaekJoon.step.level4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Integer> numberSequence = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= 9; i++) {
            int number = Integer.parseInt(reader.readLine());
            numberSequence.put(number, i);
            max = Math.max(number, max);
        }
        stringBuilder.append(max + "\n");
        stringBuilder.append(numberSequence.get(max));
        writer.write(String.valueOf(stringBuilder));
        writer.flush();
        reader.close();
        writer.close();
    }
}

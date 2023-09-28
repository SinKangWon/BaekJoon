package BaekJoon.step.level4;

import java.io.*;
import java.util.stream.Stream;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int arrayLength = Integer.parseInt(reader.readLine());
        String[] arr = reader.readLine().split(" ");
        int[] array = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
        int minNum = array[0];
        int maxNum = array[0];

        for (int i = 0; i < arrayLength; i ++) {
            minNum = Math.min(minNum, array[i]);
            maxNum = Math.max(maxNum, array[i]);
        }

        stringBuilder.append(minNum + " " + maxNum);
        writer.write(String.valueOf(stringBuilder));
        writer.flush();
        reader.close();
        writer.close();
    }
}



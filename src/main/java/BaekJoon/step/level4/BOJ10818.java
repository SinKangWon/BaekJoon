package BaekJoon.step.level4;

import java.io.*;
import java.util.stream.Stream;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int arrayLength = Integer.parseInt(reader.readLine());
        String[] arr = reader.readLine().split(" ");;
        int minNum = Integer.parseInt(arr[0]);
        int maxNum = Integer.parseInt(arr[0]);

        for (int i = 0; i < arrayLength; i ++) {
            minNum = Math.min(minNum, Integer.parseInt(arr[i]));
            maxNum = Math.max(maxNum, Integer.parseInt(arr[i]));
        }

        stringBuilder.append(minNum + " " + maxNum);
        writer.write(String.valueOf(stringBuilder));
        writer.flush();
        reader.close();
        writer.close();
    }
}



package BaekJoon.step.level4;

import java.io.*;
import java.util.stream.Stream;

public class BOJ10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String parameter = reader.readLine();
        String[] list = parameter.split(" ");
        int listLength = Integer.parseInt(list[0]);
        int key = Integer.parseInt(list[1]);
        String inputStr = reader.readLine();
        String[] inputArrayChar = inputStr.split(" ");
        int[] array = Stream.of(inputArrayChar).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < listLength; i++) {
            if (Math.min(key, array[i]) != key){
                writer.write(Math.min(key, array[i]) + " ");
            }
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}

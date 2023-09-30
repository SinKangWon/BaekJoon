package BaekJoon.step.level4;

import java.io.*;

public class BOJ10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] bowlAndLine = reader.readLine().split(" ");
        int bowl = Integer.parseInt(bowlAndLine[0]);
        int line = Integer.parseInt(bowlAndLine[1]);
        int[] bowlList = new int[bowl];
        int startPoint;
        int endPoint;
        int ballNumber;

        for (int i = 0; i < line; i++) {

            String[] input = reader.readLine().split(" ");

            startPoint = Integer.parseInt(input[0]) - 1;
            endPoint = Integer.parseInt(input[1])- 1;
            ballNumber = Integer.parseInt(input[2]);

            for (int s = startPoint; s <= endPoint; s++) {
                bowlList[s] = ballNumber;
            }

        }
        for (int i = 0; i < bowlList.length; i++) {
            writer.write(String.valueOf(bowlList[i]) + " ");
        }


        writer.flush();
        reader.close();
        writer.close();
    }
}

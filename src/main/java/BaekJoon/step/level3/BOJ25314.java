package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        String end = "int";
        String keep = "";
        for (int i = 0; i < input; i += 4) {
            keep = keep + "long ";
        }
        System.out.println(keep + end);
    }
}

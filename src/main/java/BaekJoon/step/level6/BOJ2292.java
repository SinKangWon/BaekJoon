package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        reader.close();

        int result;

        int bee = 1;
        int l = 0;
        while (true){

            if (N <= bee){
                result = l + 1;
                break;
            }
                l = l + 1;
                bee = bee + 6*l;
        }
        System.out.println(result);
    }
}

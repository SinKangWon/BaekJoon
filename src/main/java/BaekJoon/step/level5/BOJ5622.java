package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> dialMap = new HashMap<>();
        char dialAlphabet = 65; // A~Z ASCII CODE 65~90
        int dialNum = 3; // start point == 3

        for (int i = 1; i < 27; i++)
        {
            switch (dialAlphabet) {
                case 'D' : case 'G': case 'J': case 'M': case 'P': case 'T': case 'W':
                    dialNum += 1;
            }
            dialMap.put(dialAlphabet, dialNum);
            dialAlphabet +=1;

        }

        char[] telNum = reader.readLine().toCharArray();
        int intBox = 0;
        for (char i : telNum) {
            intBox += Integer.parseInt(String.valueOf(dialMap.get(i)));
        }
        System.out.print(intBox);
    }
}

package BaekJoon.step.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int subjectLength = Integer.parseInt(stringTokenizer.nextToken());
        int[] subject = new int[subjectLength];
        stringTokenizer = new StringTokenizer(reader.readLine());

        int realMax = 0;
        for (int i = 0; i < subject.length; i++) {
            subject[i] = Integer.parseInt(stringTokenizer.nextToken());
            int max = 0;
            for (int l = 0; l <= i; l++) {
                max = Math.max(subject[i] , subject[l]);
            }
            realMax = Math.max(realMax, max);
        }
        double average = 0;
        for (int i : subject) {
            double avg;
            avg = (double)i /realMax*100;
            average += avg;
        }
        System.out.println(average/subjectLength);
    }
}

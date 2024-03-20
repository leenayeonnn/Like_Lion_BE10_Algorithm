package com.example.chap02;

public class CalcSumAndAvgWithTwoDim {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 80, 70, 60}, // 첫 번째 학생의 점수
                {80, 70, 60, 50}, // 두 번째 학생의 점수
                {70, 60, 50, 40} // 세 번째 학생의 점수
        };

        calcSumAndAvg(scores);
    }

    private static void calcSumAndAvg(int[][] scores) {
        int sum;
        double avg;
        for (int i = 0; i < scores.length; i++) {
            sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println((i + 1) + "th student");
            System.out.printf("sum : %d , avg : %.2f\n\n", sum, (double) sum / scores[i].length);
        }
    }
}

package chap04;

//다차원 배열 초기화 및 출력
public class ArrayEx18 {
    public static void main(String[] args) {
        int [][] score = {
                {100, 100, 100},
                {80, 90, 90},
                {70, 80, 80},
                {60, 60, 60},
                {50, 30, 30},
        };

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
            }
        }

    }
}

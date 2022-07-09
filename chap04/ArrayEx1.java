package chap04;

public class ArrayEx1 {
	public static void main(String[] args) {
		int [] score = new int[5];							//정수형 배열 생성
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;									//인덱스값에 변수나 수식도 들어 갈 수 있음
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k+2] + score[4];

		for (int i=0; i< score.length; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]);	//ArrayIndexOutOfBoundsException

	}	//main
}

package chap05;

/**
 * @author R2j
 * 초기식, 증감식이 꼭 한개씩인것은 아니다. 
 */
public class Sample05 {
	public static void main(String[] args) {
		for (int i = 0, j = 9;  i < 5; i++, j-=2) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int h = 0; h < j; h++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
}

package chap03;

/**
 * 비트연산자 AND
 * @author R2j
 *
 */
public class Sample07 {
	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		System.out.println("* AND ");
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a), a);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(b), b);
		System.out.println("==================================");
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a&b), a&b);
	}
}

package chap06;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해주세요");
		String temp = sc.nextLine().toUpperCase();
		int left = 0;
		int right = 0; 
		char [] temps = temp.toCharArray();
		/*for(char c : temps) {
			switch(c) {
				case 'A', 'B', 'C', 'D', 'E', 'F'
					 ,'G', 'Q', 'R', 'S', 'T', 'V'
					 ,'W', 'X', 'Z', '1', '2'
					 ,'3', '4', '5' -> left++;
				case 'H', 'I', 'K', 'J', 'L', 'M'
				 ,'N', 'O', 'P', 'U', 'Y', '6'
				 ,'7', '8', '9', '0' -> right++;
			}
		}*/
		System.out.printf("left : %d ,  right : %d", left, right);
	}
}

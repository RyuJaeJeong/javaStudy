package chap05;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		String result = "";
		int[] num = {4, 6, 9, 2};
		System.out.println("검색할 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==no) {
				result = (i+1) +  "번 검색하여 값을 찾았습니다.";
				break;
			}
		}
		
		if("".equals(result)) {
			System.out.println("찾을 수 없는 값입니다.");
		}else {
			System.out.println(result);
		}
		
	}
}

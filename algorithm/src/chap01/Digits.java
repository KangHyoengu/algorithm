package chap01;

import java.util.Scanner;

public class Digits {

	// 논리연산과 드모르간의 법칙
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no = 0; // 정수를 입력받을 변수 
		
		System.out.println("두 자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력: ");
			no = stdIn.nextInt();
		} while(no < 10 || no > 99); // 두자리의 양수가 아니면 입력이 반복된다.
		
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
		stdIn.close();
	}

}

package chap01;

import java.util.Scanner;

public class Prac5 {
	
	public static void multiTable(String calc) {
		// 상단 숫자 출력
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		// 곱셈표를 출력하는 부분
		for (int i = 1; i < 10; i++) {
			System.out.print(" " + i + " |"); // 현재 단 수를 보여줌
			for (int j = 1; j < 10; j++) {
				switch(calc) {
					// 덧셈표를 출력하는 메서드(연습문제 Q13)
					case "+":
						System.out.printf("%3d", i + j);
						break;
						
					// 곱셈표를 출력하는 메서드 (연습문제 Q12)
					case "*":
						System.out.printf("%3d", i * j); // 현재 단 수의 곱을 보여줌
						break;
				}
			}
			System.out.println();
		}
	}
	
	
	// 정사각형을 *로 출력하는 메서드 (연습문제 Q14)
	public static void square(int n) {
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수: " + n);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 연습문제 Q12
		multiTable("*");
		System.out.println();
		
		// 연습문제 Q13
		multiTable("+");
		System.out.println();
		
		// 연습문제 Q14
		int n = 0;
		do {
			System.out.print("단 수를 입력하세요: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		square(n);
		
		stdIn.close();
	}

}

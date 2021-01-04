package chap01;

import java.util.Scanner;

public class Prac5 {
	// 곱셈표를 출력하는 메서드 (연습문제 Q12)
	public static void multiTable() {
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
	
	// 덧셈표를 출력하는 메서드(연습문제 Q13)
	
	public static void plusTable() {
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i + j);
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
		multiTable();
		System.out.println();
		
		// 연습문제 Q13
		plusTable();
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

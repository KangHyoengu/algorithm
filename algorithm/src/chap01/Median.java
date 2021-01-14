package chap01;

import java.util.Scanner;

public class Median {

	// 3개의 정수값 중에 중앙값을 구하는 메서드
	static int med3(int a, int b, int c) {
		if(a >= b) { // a b c or a c b or c a b 
			if(b >= c) { // a b c
				return b;
			} else if(a <= c) { // c a b
				return a;
			} else { // a c b
				return c;
			}
		} else if(a > c) { // b a c
			return a;
		} else if(b > c) { // b c a
			return c;
		} else { // c b a
			return b;
		}
	}
	
	public static void main(String[] args) {
		// 입력 받는 Scanner 클래스 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 세 정수 입력
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt(); // a 입력 받기
		System.out.print("b의 값: ");
		int b = stdIn.nextInt(); // b 입력 받기
		System.out.print("c의 값: ");
		int c = stdIn.nextInt(); // c 입력 받기
		
		// 결과 출력
		System.out.println("중앙값은 '" + med3(a, b, c) + "'입니다.");
		stdIn.close();
	}

}

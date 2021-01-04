package chap01;

import java.util.Scanner;

public class Prac4 {
	public static Scanner stdIn = new Scanner(System.in);
	
	// b - a의 값을 구하는 메서드
	public static void minus(int a, int b) {
		while(b - a <= 0) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값: ");
			b = stdIn.nextInt();
		}
		
		System.out.println("b - a는 '" + (b - a) +"'입니다.");
	}
	
	// 양의 정수를 입력하고 자릿수를 출력하는 메서드
	public static void posiNum(int num) {
		while (num <= 0) {
			System.out.println("양수를 입력해 주세요!");
			num = stdIn.nextInt();
		}
		
		System.out.println("그 수는 " + (num + "").length() + "자리입니다.");
	}
	
	public static void main(String[] args) {
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		
		minus(a, b);
		
		System.out.print("양의 정수: ");
		int num = stdIn.nextInt();
		
		posiNum(num);
		
		stdIn.close();
	}

}

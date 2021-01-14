package chap01;

import java.util.Scanner;

public class SumForPos {
	
	// 양수만 입력받는 1부터 n까지의 정수의 합을 구하는 main메서드
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = 0; // n의 값
		int sum = 0; // 정수의 합계
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		// 양수만 받는 do ~ while
		do {
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
		} while(n <= 0); // 최초 실행 후 양수가 아닐경우 n을 반복하여 입력받음
		
		// 1부터 n까지의 정수의 합
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		// 결과 출력
		System.out.println("1부터 " + n + "까지의 합은 '" + sum + "'입니다.");
		stdIn.close();
	}

}

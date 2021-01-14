package chap01;

import java.util.Scanner;

public class SumFor {
	
	// 1부터 n까지의 합을 for문을 사용해서 구하는 main메서드
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// n의 값 입력
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0; // 정수의 합계
		
		// 1 ~ n까지의 합
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		// 결과 출력
		System.out.println("1부터 " + n + "까지의 합은 '" + sum + "'입니다.");
		stdIn.close();
	}

}

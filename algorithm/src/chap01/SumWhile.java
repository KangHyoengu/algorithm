package chap01;

import java.util.Scanner;

public class SumWhile {
	
	// 1부터 n까지의 합을 while문을 사용해서 구하는 main메서드
	public static void main(String[] args) {
		// 정수를 입력받을 Scanner 클래스 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt(); // n 입력
		
		int sum = 0;
		int i = 1;
		
		// 1 ~ n 까지의 while문을 사용하여 합 구하기
		while(i <= n) {
			sum += i;
			i++;
			System.out.println("변수 i = " + i);
		}
		
		// 결과 출력
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		stdIn.close();
	}

}

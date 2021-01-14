package chap01;

public class Prac3 {
	
	// 1부터 n까지의 합 문자열로 출력하는 메서드 (연습문제 Q7)
	public static String stringSum(int n) {
		String str = ""; // 덧셈과정 문자열
		int sum = 0; // 정수의 합
		
		// 덧셈 과정 문자열을 연결하는 부분
		for (int i = 1; i <= n; i++) {
			if(i != n) {
				str += i + " + ";
			} else {
				str += i + " = ";
			}
			sum += i; // 정수의 합 구하기
		}
		
		// 덧셈 과정과 덧셈 결과 출력
		return str + sum;
	}
	
	// 1부터 n까지의 합 가우스 덧셈 사용하는 메서드 (연습문제 Q8)
	public static int gaussSum(int n) {
		return (1 + n) * (n / 2);
	}
	
	// a부터 b까지의 그 사이값의 합을 구하는 메서드
	public static int sumof(int a, int b) {
		int sum = 0, start = a, end = b; // 합계, 시작값, 종료값
		
		// a가 b보다 크다면 시작값을 b, 종료값을 a로 변경
		if(a > b) {
			start = b;
			end = a;
		}
		
		// 두 수 사이의 정수값의 합을 구하는 부분
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum; // 결과값
	}
	public static void main(String[] args) {
		int n = 10; // 정수 n
		
		// 연습문제 Q7
		System.out.println(stringSum(n));
		
		// 연습문제 Q8
		System.out.println("가우스 덧셈을 사용한 1부터 "+n+"까지의 합은 '"+gaussSum(n)+"'입니다.");
		
		// 연습문제 Q9
		int a = 12;
		int b = 4;
		System.out.println(a+"와 "+b+"사이의 정수의 합은 '" + sumof(a, b) + "'입니다.");
	}

}

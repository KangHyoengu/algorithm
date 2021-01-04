package chap01;

public class Prac3 {
	
	// 1부터 n까지의 합 문자열로 출력하는 메서드 (연습문제 Q7)
	public static String stringSum(int n) {
		String str = "";
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i != n) {
				str += i + " + ";
			} else {
				str += i + " = ";
			}
			sum += i;
		}
		
		return str + sum;
	}
	
	// 1부터 n까지의 합 가우스 덧셈 사용하는 메서드 (연습문제 Q8)
	public static int gaussSum(int n) {
		return (1 + n) * (n / 2);
	}
	
	// a부터 b까지의 그 사이값의 합을 구하는 메서드
	public static int sumof(int a, int b) {
		int sum = 0, start = a, end = b;
		
		if(a > b) {
			start = b;
			end = a;
		}
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		int n = 10;
		
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

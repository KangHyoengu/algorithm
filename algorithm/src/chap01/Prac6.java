package chap01;

public class Prac6 {
	
	// 직각 삼각형을 구하는 메서드 (연습문제 Q15)
	// 왼쪽 아래 직각
	public static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
	
	// 왼쪽 위 직각
	public static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
	
	// 오른쪽 아래 직각
	public static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j < n - i + 1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		} 
	}
	
	// 오른쪽 위 직각
	public static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
	}
	
	// n단의 피라미드를 출력하는 메서드
	public static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + i - 1; j++) {
				if(j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	// n단의 숫자 피라미드를 출력하는 메서드
	public static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + i - 1; j++) {
				if(j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// 연습문제 Q15
		int n = 5;
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
		System.out.println();
		
		// 연습문제 Q16
		spira(n);
		System.out.println();
		
		// 연습문제 Q17
		npira(n);
		System.out.println();
	}

}

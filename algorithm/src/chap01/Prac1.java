package chap01;

public class Prac1 {
	
	//4개의 값 중에서 최댓값을 구하는메서드
	static int max4(int a, int b, int c, int d) {
		int max = a; // 최댓값
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	// 3개의 값 중 최소값을 구하는 메서드
	static int min3(int a, int b, int c) {
		int min = a; // 최솟값
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		return min;
	}
	
	// 4개의 값 중 최소값을 구하는 메서드
	static int min4(int a, int b, int c, int d) {
		int min = a; // 최솟값
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		if(d < min) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// 결과 출력
		System.out.println("max4(3, 2, 1, 4) = " + max4(3, 2, 1, 4));
		System.out.println("max4(3, 2, 2, 3) = " + max4(3, 2, 2, 3));
		System.out.println("max4(3, 4, 1, 2) = " + max4(3, 4, 1, 2));
		System.out.println("max4(3, 2, 4, 3) = " + max4(3, 2, 4, 3));
		System.out.println("min3(2, 1, 3) = " + min3(2, 1, 3));
		System.out.println("min3(3, 3, 2) = " + min3(3, 3, 2));
		System.out.println("min3(3, 3, 3) = " + min3(3, 3, 3));
		System.out.println("min3(2, 2, 3) = " + min3(2, 2, 3));
		System.out.println("min3(2, 3, 1) = " + min3(2, 3, 1));
		System.out.println("min4(2, 4, 3, 2) = " + min4(2, 4, 3, 2));
		System.out.println("min4(1, 3, 4, 2) = " + min4(1, 3, 4, 2));
		System.out.println("min4(2, 3, 3, 4) = " + min4(2, 3, 3, 4));
		System.out.println("min4(1, 2, 2, 3) = " + min4(1, 2, 2, 3));
	}

}

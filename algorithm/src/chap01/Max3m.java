package chap01;

public class Max3m {

	// a, b, c의 최대값을 구하여 반환하는 메서드
	static public int max3(int a, int b, int c) { // 매개변수로 세 정수를 받음
		int max = a; // 최대값
		
		if(b > max) { 
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// 결과 출력
		System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
		System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
		System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
		System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
		System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
		System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3));
		System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
		System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
		System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
		System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
		System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
		System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
	}

}

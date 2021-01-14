package chap01;

public class Prac2 {
	
	//세 정수중 가운데 값을 구하는 메서드
	static public int med3(int a, int b, int c) {
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
	
	// 중앙값을 구하는 다른 방법
	public static int med3Other(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("med3(3, 2, 1) = " + med3(3, 2, 1));
		System.out.println("med3(3, 2, 2) = " + med3(3, 2, 2));
		System.out.println("med3(3, 1, 2) = " + med3(3, 1, 2));
		System.out.println("med3(3, 2, 3) = " + med3(3, 2, 3));
		System.out.println("med3(2, 1, 3) = " + med3(2, 1, 3));
		System.out.println("med3(3, 3, 2) = " + med3(3, 3, 2));
		System.out.println("med3(3, 3, 3) = " + med3(3, 3, 3));
		System.out.println("med3(2, 2, 3) = " + med3(2, 2, 3));
		System.out.println("med3(2, 3, 1) = " + med3(2, 3, 1));
		System.out.println("med3(2, 3, 2) = " + med3(2, 3, 2));
		System.out.println("med3(1, 3, 2) = " + med3(1, 3, 2));
		System.out.println("med3(2, 3, 3) = " + med3(2, 3, 3));
		System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3));
	}

}

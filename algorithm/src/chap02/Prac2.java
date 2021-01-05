package chap02;

public class Prac2 {
	
	// 배열의 요소를 교환하는 메서드
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열을 역순으로 정렬하는 메서드 
	public static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			show(a);
			System.out.println("a[" + i + "]과(와) a[" + (a.length - 1 - i) + "]를 교환합니다.");
			swap(a, i, a.length - 1 - i);
		}
		show(a);
		System.out.println("역순 과정을 마쳤습니다.");
	}
	
	// 배열의 요소를 보여주는 메서드
	public static void show(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	// 배열의 요소의 합을 구하는 메서드 (연습문제 Q3)
	public static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int [] a = {5, 10, 73, 2, -5, 42};
		
		// 연습문제 Q2
		reverse(a);
		
		// 연습문제 Q3
		System.out.println("배열의 합은 '" + sumOf(a) + "'입니다.");
	}

}

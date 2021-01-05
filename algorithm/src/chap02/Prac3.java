package chap02;

import java.util.Arrays;

public class Prac3 {
	// 배열 b를 a로 복사하는 메서드
	public static void copy(int[] a, int[]b) {
		if(a.length != b.length) {
			System.out.println("두 배열의 길이가 같지 않습니다!");
			return ;
		}
		
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	// 배열 b를 역순으로 a에 복사하는 메서드
	public static void rcopy(int[] a, int[] b) {
		copy(a, b);
		reverse(a);
	}
	
	// 배열의 두 요소를 교환하는 메서드
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열을 역순으로 정렬하는 메서드
	public static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {11, 22, 33, 44, 55};
		
		// 연습문제 Q4
		System.out.println("배열 a: "+Arrays.toString(a));
		System.out.println("배열 b:" + Arrays.toString(b));
		copy(a, b);
		System.out.println("복사된 배열 a: "+Arrays.toString(a));
		
		a = new int[] {10, 20, 30, 40, 50};
		b = new int[] {11, 22, 33, 44, 55};
		
		// 연습문제 Q5
		System.out.println("배열 a: "+Arrays.toString(a));
		System.out.println("배열 b:" + Arrays.toString(b));
		rcopy(a, b);
		System.out.println("역순으로 복사된 배열 a: "+Arrays.toString(a));
	}

}

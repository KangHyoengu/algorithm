package chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	// 배열의 최댓값을 구하는 메서드
	public static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			System.out.print("height[" + i + "]: ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("최댓값은 '" + maxOf(height) + "'입니다.");
		stdIn.close();
	}

}

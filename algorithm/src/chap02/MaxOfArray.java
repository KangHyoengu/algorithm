package chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	// �迭�� �ִ��� ���ϴ� �޼���
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
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			System.out.print("height[" + i + "]: ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("�ִ��� '" + maxOf(height) + "'�Դϴ�.");
		stdIn.close();
	}

}

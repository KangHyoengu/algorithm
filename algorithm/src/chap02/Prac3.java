package chap02;

import java.util.Arrays;

public class Prac3 {
	// �迭 b�� a�� �����ϴ� �޼���
	public static void copy(int[] a, int[]b) {
		if(a.length != b.length) {
			System.out.println("�� �迭�� ���̰� ���� �ʽ��ϴ�!");
			return ;
		}
		
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	// �迭 b�� �������� a�� �����ϴ� �޼���
	public static void rcopy(int[] a, int[] b) {
		copy(a, b);
		reverse(a);
	}
	
	// �迭�� �� ��Ҹ� ��ȯ�ϴ� �޼���
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// �迭�� �������� �����ϴ� �޼���
	public static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {11, 22, 33, 44, 55};
		
		// �������� Q4
		System.out.println("�迭 a: "+Arrays.toString(a));
		System.out.println("�迭 b:" + Arrays.toString(b));
		copy(a, b);
		System.out.println("����� �迭 a: "+Arrays.toString(a));
		
		a = new int[] {10, 20, 30, 40, 50};
		b = new int[] {11, 22, 33, 44, 55};
		
		// �������� Q5
		System.out.println("�迭 a: "+Arrays.toString(a));
		System.out.println("�迭 b:" + Arrays.toString(b));
		rcopy(a, b);
		System.out.println("�������� ����� �迭 a: "+Arrays.toString(a));
	}

}

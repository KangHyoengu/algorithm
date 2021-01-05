package chap02;

public class Prac2 {
	
	// �迭�� ��Ҹ� ��ȯ�ϴ� �޼���
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// �迭�� �������� �����ϴ� �޼��� 
	public static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			show(a);
			System.out.println("a[" + i + "]��(��) a[" + (a.length - 1 - i) + "]�� ��ȯ�մϴ�.");
			swap(a, i, a.length - 1 - i);
		}
		show(a);
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
	
	// �迭�� ��Ҹ� �����ִ� �޼���
	public static void show(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	// �迭�� ����� ���� ���ϴ� �޼��� (�������� Q3)
	public static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int [] a = {5, 10, 73, 2, -5, 42};
		
		// �������� Q2
		reverse(a);
		
		// �������� Q3
		System.out.println("�迭�� ���� '" + sumOf(a) + "'�Դϴ�.");
	}

}

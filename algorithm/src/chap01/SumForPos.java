package chap01;

import java.util.Scanner;

public class SumForPos {
	
	// ����� �Է¹޴� 1���� n������ ������ ���� ���ϴ� main�޼���
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = 0; // n�� ��
		int sum = 0; // ������ �հ�
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		// ����� �޴� do ~ while
		do {
			System.out.print("n�� ��: ");
			n = stdIn.nextInt();
		} while(n <= 0); // ���� ���� �� ����� �ƴҰ�� n�� �ݺ��Ͽ� �Է¹���
		
		// 1���� n������ ������ ��
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		// ��� ���
		System.out.println("1���� " + n + "������ ���� '" + sum + "'�Դϴ�.");
		stdIn.close();
	}

}

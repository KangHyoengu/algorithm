package chap01;

import java.util.Scanner;

public class SumWhile {
	
	// 1���� n������ ���� while���� ����ؼ� ���ϴ� main�޼���
	public static void main(String[] args) {
		// ������ �Է¹��� Scanner Ŭ���� ����
		Scanner stdIn = new Scanner(System.in);
		
		// ���� �Է� �ޱ�
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n = stdIn.nextInt(); // n �Է�
		
		int sum = 0;
		int i = 1;
		
		// 1 ~ n ������ while���� ����Ͽ� �� ���ϱ�
		while(i <= n) {
			sum += i;
			i++;
			System.out.println("���� i = " + i);
		}
		
		// ��� ���
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		stdIn.close();
	}

}

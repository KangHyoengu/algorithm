package chap01;

import java.util.Scanner;

public class TriangleLB {
	
	// ���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0; // �ﰢ���� �� ��
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		// �̵ �ﰢ���� �� ���� �Է�
		do {
			System.out.print("�� �� �ﰢ���Դϱ�?: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// �ﰢ���� ����ϴ� �κ�
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}

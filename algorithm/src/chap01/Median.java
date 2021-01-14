package chap01;

import java.util.Scanner;

public class Median {

	// 3���� ������ �߿� �߾Ӱ��� ���ϴ� �޼���
	static int med3(int a, int b, int c) {
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
	
	public static void main(String[] args) {
		// �Է� �޴� Scanner Ŭ���� ����
		Scanner stdIn = new Scanner(System.in);
		
		// �� ���� �Է�
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt(); // a �Է� �ޱ�
		System.out.print("b�� ��: ");
		int b = stdIn.nextInt(); // b �Է� �ޱ�
		System.out.print("c�� ��: ");
		int c = stdIn.nextInt(); // c �Է� �ޱ�
		
		// ��� ���
		System.out.println("�߾Ӱ��� '" + med3(a, b, c) + "'�Դϴ�.");
		stdIn.close();
	}

}

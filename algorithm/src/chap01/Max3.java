package chap01;

import java.util.Scanner;


public class Max3 {
	
	// 3���� ������ �Է��ϰ� �ִ밪�� ���մϴ�.
	public static void main(String[] args) {
		// �ܼ�â���� �Է¹޴� Scanner Ŭ���� ����
		Scanner stdIn = new Scanner(System.in);
		
		// �� ���� �Է¹ޱ�
		System.out.println("�� ������ �ִ밪�� ���մϴ�.");
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.print("b�� ��: ");
		int b = stdIn.nextInt();
		System.out.print("c�� ��: ");
		int c = stdIn.nextInt();
		
		// �ִ��� ���ϱ�
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		// �ִ밪 ��� �ϱ�
		System.out.println("�ִ밪�� '" + max + "�Դϴ�.");
		stdIn.close();
	}
}

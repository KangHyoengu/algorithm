package chap01;

import java.util.Scanner;

public class Prac4 {
	public static Scanner stdIn = new Scanner(System.in);
	
	// b - a�� ���� ���ϴ� �޼��� (�������� Q10)
	public static void minus(int a, int b) {
		// b ���� a�� �� ū ��� b�� ���� �ٽ� �Է�
		while(b - a <= 0) { // 
			System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.print("b�� ��: ");
			b = stdIn.nextInt(); // b�� ���� �Է�
		}
		
		// ��� ���
		System.out.println("b - a�� '" + (b - a) +"'�Դϴ�.");
	}
	
	// ���� ������ �Է��ϰ� �ڸ����� ����ϴ� �޼��� (�������� Q11)
	public static void posiNum(int num) {
		
		// 0�� ������ �Է¹����� ����� �Է��� ������ �Է��� �ݺ��ȴ�.
		while (num <= 0) {
			System.out.println("����� �Է��� �ּ���!");
			num = stdIn.nextInt();
		}
		
		// ��� ���
		System.out.println("�� ���� " + (num + "").length() + "�ڸ��Դϴ�.");
	}
	
	public static void main(String[] args) {
		// �������� Q10
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.print("b�� ��: ");
		int b = stdIn.nextInt();
		
		minus(a, b);
		
		// �������� Q11
		System.out.print("���� ����: ");
		int num = stdIn.nextInt();
		
		posiNum(num);
		
		stdIn.close();
	}

}

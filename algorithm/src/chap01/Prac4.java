package chap01;

import java.util.Scanner;

public class Prac4 {
	public static Scanner stdIn = new Scanner(System.in);
	
	// b - a�� ���� ���ϴ� �޼���
	public static void minus(int a, int b) {
		while(b - a <= 0) {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.print("b�� ��: ");
			b = stdIn.nextInt();
		}
		
		System.out.println("b - a�� '" + (b - a) +"'�Դϴ�.");
	}
	
	// ���� ������ �Է��ϰ� �ڸ����� ����ϴ� �޼���
	public static void posiNum(int num) {
		while (num <= 0) {
			System.out.println("����� �Է��� �ּ���!");
			num = stdIn.nextInt();
		}
		
		System.out.println("�� ���� " + (num + "").length() + "�ڸ��Դϴ�.");
	}
	
	public static void main(String[] args) {
		System.out.print("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.print("b�� ��: ");
		int b = stdIn.nextInt();
		
		minus(a, b);
		
		System.out.print("���� ����: ");
		int num = stdIn.nextInt();
		
		posiNum(num);
		
		stdIn.close();
	}

}

package chap01;

import java.util.Scanner;

public class Digits {

	// ������� ��𸣰��� ��Ģ
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no = 0;
		
		System.out.println("�� �ڸ��� ������ �Է��ϼ���.");
		
		do {
			System.out.print("�Է�: ");
			no = stdIn.nextInt();
		} while(no < 10 || no > 99);
		
		System.out.println("���� no�� ���� " + no + "��(��) �Ǿ����ϴ�.");
		stdIn.close();
	}

}

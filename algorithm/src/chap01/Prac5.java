package chap01;

import java.util.Scanner;

public class Prac5 {
	// ����ǥ�� ����ϴ� �޼��� (�������� Q12)
	public static void multiTable() {
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
	
	// ����ǥ�� ����ϴ� �޼���(�������� Q13)
	
	public static void plusTable() {
		System.out.println("   |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+---------------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}
	
	// ���簢���� *�� ����ϴ� �޼��� (�������� Q14)
	public static void square(int n) {
		System.out.println("�簢���� ����մϴ�.");
		System.out.println("�� ��: " + n);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// �������� Q12
		multiTable();
		System.out.println();
		
		// �������� Q13
		plusTable();
		System.out.println();
		
		// �������� Q14
		int n = 0;
		do {
			System.out.print("�� ���� �Է��ϼ���: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		square(n);
		
		stdIn.close();
	}

}

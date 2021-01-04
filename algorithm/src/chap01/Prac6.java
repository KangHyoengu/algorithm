package chap01;

public class Prac6 {
	
	// ���� �ﰢ���� ���ϴ� �޼��� (�������� Q15)
	// ���� �Ʒ� ����
	public static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
	
	// ���� �� ����
	public static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
	
	// ������ �Ʒ� ����
	public static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j < n - i + 1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		} 
	}
	
	// ������ �� ����
	public static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
	}
	
	// n���� �Ƕ�̵带 ����ϴ� �޼���
	public static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + i - 1; j++) {
				if(j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	// n���� ���� �Ƕ�̵带 ����ϴ� �޼���
	public static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + i - 1; j++) {
				if(j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// �������� Q15
		int n = 5;
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
		System.out.println();
		
		// �������� Q16
		spira(n);
		System.out.println();
		
		// �������� Q17
		npira(n);
		System.out.println();
	}

}

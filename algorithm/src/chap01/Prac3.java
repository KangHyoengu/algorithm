package chap01;

public class Prac3 {
	
	// 1���� n������ �� ���ڿ��� ����ϴ� �޼��� (�������� Q7)
	public static String stringSum(int n) {
		String str = ""; // �������� ���ڿ�
		int sum = 0; // ������ ��
		
		// ���� ���� ���ڿ��� �����ϴ� �κ�
		for (int i = 1; i <= n; i++) {
			if(i != n) {
				str += i + " + ";
			} else {
				str += i + " = ";
			}
			sum += i; // ������ �� ���ϱ�
		}
		
		// ���� ������ ���� ��� ���
		return str + sum;
	}
	
	// 1���� n������ �� ���콺 ���� ����ϴ� �޼��� (�������� Q8)
	public static int gaussSum(int n) {
		return (1 + n) * (n / 2);
	}
	
	// a���� b������ �� ���̰��� ���� ���ϴ� �޼���
	public static int sumof(int a, int b) {
		int sum = 0, start = a, end = b; // �հ�, ���۰�, ���ᰪ
		
		// a�� b���� ũ�ٸ� ���۰��� b, ���ᰪ�� a�� ����
		if(a > b) {
			start = b;
			end = a;
		}
		
		// �� �� ������ �������� ���� ���ϴ� �κ�
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum; // �����
	}
	public static void main(String[] args) {
		int n = 10; // ���� n
		
		// �������� Q7
		System.out.println(stringSum(n));
		
		// �������� Q8
		System.out.println("���콺 ������ ����� 1���� "+n+"������ ���� '"+gaussSum(n)+"'�Դϴ�.");
		
		// �������� Q9
		int a = 12;
		int b = 4;
		System.out.println(a+"�� "+b+"������ ������ ���� '" + sumof(a, b) + "'�Դϴ�.");
	}

}

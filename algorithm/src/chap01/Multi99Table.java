package chap01;

public class Multi99Table {
	
	// ����ǥ�� ����ϴ� main�޼���
	public static void main(String[] args) {
		System.out.println("  ----- ����ǥ -----");
		
		for (int i = 1; i < 10; i++) {
			// n�� ����
			for (int j = 1; j < 10; j++) {
				// n���� ���� ����
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}

}

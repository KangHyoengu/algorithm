package chap01;

public class Multi99Table {
	
	// °ö¼ÀÇ¥¸¦ Ãâ·ÂÇÏ´Â main¸Þ¼­µå
	public static void main(String[] args) {
		System.out.println("  ----- °ö¼ÀÇ¥ -----");
		
		for (int i = 1; i < 10; i++) {
			// n´Ü ½ÃÀÛ
			for (int j = 1; j < 10; j++) {
				// n´ÜÀÇ °ö¼À ½ÃÀÛ
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}

}

package star;

public class Oblique {
	public static void main(String[] args) {
		int grape = 5;//層式
		for(int i=1;i<=grape;i++) {
			for(int n=1;n<=i;n++) {//每一層有幾個
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

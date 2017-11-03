public class Problem3{

	public static void main(String[] args) {
		for(int k = 1; k<10;k++){
			System.out.println();
			PrintKStars(k);
		}
	}

		public static void PrintKStars (int k) {
			for(int i = 0; i<k; i++){
				System.out.print("*");

		}
	}
}
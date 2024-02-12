package additional_Task;

public class Asterick {

	public static void main(String[] args) {

		System.out.println("Asterick Ascending");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println("Asterick Descending");

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {

				System.out.print("*");

			}
			System.out.println();

		}
		
		for (int i = 1; i <= 5; i++) { 
			
			for (int j = 1; j < args.length; j++) {
				
			}
			
		}

	}

}

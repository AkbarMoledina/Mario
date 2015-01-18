import java.util.Scanner;

public class Mario {
	public static void main(String[] args) {

		int minh = 0, maxh = 23;
		int x;
		do {
			System.out.println("Enter a height for the half pyramid (between "
					+ minh + " and " + maxh + "):");
			Scanner input = new Scanner(System.in);
			x = input.nextInt();
		} while (x < minh || x > maxh);
		
		for (int i = 0; i < x; i++) {
			for (int s = i; x > s + 1; s++) {
				System.out.print(" ");
			}
			for (int h = i; h > -2; h--) {
				System.out.print("#");
			}
			System.out.println();
			
		}
	}
}

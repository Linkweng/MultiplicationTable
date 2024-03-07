import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter Number how many you want to multiply: ");
			int	UserInput = scanner.nextInt();
			
			for(int i = 0; i < 10; i++) {
				for(int j = 1; j < UserInput; j++) {
					int total = i * j;
					System.out.println( i + "X" + j + "=" + total);
				}
				System.out.println();
			}
		
	}

}

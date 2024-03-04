import java.util.Scanner;

class varread{
	public static void main(String[] args){
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = scanner.nextInt();
		System.out.println("You entered: "+number);
		scanner.close();
	}
}

import java.util.Scanner;

class sum{
	public static void main(String[] args){
		int n1,n2,s;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		s = n1+n2;
		System.out.println("Sum of "+n1+" and "+n2+"= "+s);
		scanner.close();
	}
}

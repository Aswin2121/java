import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class sort{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of strings");
		int no=scanner.nextInt();
		String[] str=new String  [no];
		scanner.nextLine();
			for(int i=0;i<no;i++)
			{
			System.out.println("Enter strings");
			str[i]=scanner.nextLine();
			}
		Arrays.sort(str);
		System.out.println("sorted strings");
		for(int i=0;i<no;i++)
			{
			System.out.println(str[i]);
			}
}
}


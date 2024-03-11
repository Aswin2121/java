import java.io.*;
import java.util.Scanner;
class student{
	public static void main(String[] args){
		int total=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of the student");
		
		int st=scanner.nextInt();
		int[] mark=new int[100];
		for(int i=0;i<st;i++){

		System.out.println("Enter the marks of student");
		mark[i]=scanner.nextInt();
		total=total+mark[i];
		}
		float percentage=total/st;
		System.out.println("Total:"+total);
		System.out.println("percentage:"+percentage);
		}
		}

import java.io.*;
import java.util.Scanner;
class strmanipulate{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		System.out.println("STRING MANIPULATION");
		System.out.println("length of string:"+str.length());
		System.out.println("Uppercase:"+str.toUpperCase());
		System.out.println("lowercase:"+str.toLowerCase());
		System.out.println("Index of a:"+str.indexOf('a'));
		System.out.println("JOIN:"+str.concat("joined"));
StringBuffer st=new StringBuffer(str);
System.out.println("String Manipulation using string buffer:");
st.reverse();
System.out.println("Reversed string:"+st.toString());
}
}		

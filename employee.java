import java.util.*;
import java.util.Scanner;
class employee{
int eNo;
String eName;
double salary;

employee(int eNo,String eName,double salary)
{
this.eNo=eNo;
this.eName=eName;
this.salary=salary;
}
}
public class Main{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);

System.out.println("Enter the number of employees");
int n=scanner.nextInt();

//Create an array of employee numbers
employee[] employees=new employee[n];

//read employee information
for(int i=0;i<n;i++){
System.out.println("Enter the details for employee");
System.out.print("Employee number");
int eNo=scanner.nextInt();
System.out.println("Employee name");
String eName=scanner.next();
System.out.println("Salary");
double salary=scanner.nextDouble();
employees[i]=new employee(eNo,eName,salary);
}
//search for an employee by eNo
System.out.println("Enter the employee number to search");
int searchEno=scanner.nextInt();
boolean found=false;

for(employee emp:employees){
if(emp.eNo==searchENo){
System.out.println("Employee found");
System.out.println("Employee number :"+emp.eNo);
System.out.println("Employee name"+emp.eName);
System.out.println("salary"+emp.salary);
found=true;
break;
}
}
if(!found){
System.out.println("Employee with employee number"+searchENo+"not found");
}
}
}




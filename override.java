/*******************************************************
 * file:method override
 * description : employee details using override
 * Author : jo
 * version :1.0
 * Date:17/10/2023
 */
package javalab;
import java.util.Scanner;
public class override {
public static void main(String[]args) {
officer office=new officer();
manager manage=new manager();
System.out.println("Enter details of officer");
office.details();
office.specialisation();
System.out.println("Enter details of manager");
manage.details();
manage.department();
System.out.println("Details of officer");
office.printdetails();
office.printspecialisation();
System.out.println("Details of manager");
manage.printdetails();
manage.printdepartment();   }	
}
class employee   
{
Scanner sc =new Scanner(System.in);
String name,address,specialisation,department;	
int  age,salary;
long Ph_no;
public void details()        {
	System.out.println("Name :");
	name=sc.next(); 	
	System.out.println("Age :");
	age=sc.nextInt();
	System.out.println("Phone number :");
	Ph_no=sc.nextLong();
	System.out.println("Address :");
	address=sc.next();
	System.out.println("Salary :");
	salary=sc.nextInt();     } 
public void printdetails()   {
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Phone number :"+Ph_no);
	System.out.println("Address :"+address);
	System.out.println("Salary :"+salary);    }
}
class officer extends employee {
	public void specialisation() {
	System.out.println("Enter specialisation"); 
	specialisation=sc.next(); }
	public void printspecialisation() {
	System.out.println("Specialisation :"+specialisation); 	}
	}
class manager extends employee {
	public void department() {
		System.out.println("Enter epartment"); 
		department=sc.next(); }
	public void printdepartment() {
		System.out.println("Department:"+department); }
}






















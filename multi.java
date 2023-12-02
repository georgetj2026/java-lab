package javalab;
import java.util.Scanner;
class multiplication {
	synchronized void printmultiplication(int num) {   
		// synchronized the function-
	    // without using the block
		for (int i=1; i<=5;i++)
			System.out.println(i+"x"+num+"="+i*num);
		
	}
}
class Mythread1 extends Thread{
	multiplication t;
	int num;
	Mythread1(multiplication t,int num) {
	this.t=t;
	this.num=num;
		}
	public void run() { 
	System.out.println("THREAD 1");
		t.printmultiplication(num);
	}
}
class Mythread2 extends Thread{
	multiplication t;
	int num;
	Mythread2(multiplication t,int num) {
	this.t=t;
	this.num=num;
		}
	public void run() { 
		System.out.println("THREAD 2");
		t.printmultiplication(num);
	}
}
class Mythread3 extends Thread{
	multiplication t;
	int num;
	Mythread3(multiplication t,int num) {
	this.t=t;
	this.num=num;
		}
	public void run() {  // entry point of thread2
		System.out.println("THREAD 3");
		t.printmultiplication(num);
	}
}
public class multi {
public static void main(String[]args) {
	multiplication m= new multiplication();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the table you want to run by thread1"); // to print thread name
	int a=sc.nextInt();
	Mythread1 T1 = new Mythread1(m,a);
	System.out.println("Enter the table you want to run by thread2"); // to print thread name
	int b=sc.nextInt();
    Mythread2 T2 = new Mythread2(m,b);
    System.out.println("Enter the table you want to run by thread3"); // to print thread name
	int c=sc.nextInt();
    Mythread3 T3 = new Mythread3(m,c);
    T1.start(); 
    T2.start(); 
	T3.start();	

}}

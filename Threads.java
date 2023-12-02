package javalab;
import java.util.Random;  //-package to create random number
class Numbermanager 
  {
	private int GenerateNo;
	private boolean No_generated=false;
	public synchronized void generatenumber()
	    {	    
		GenerateNo = new Random().nextInt(99)+2;  //generates a random number
	    System.out.println("Generated random number:"+GenerateNo);
	    No_generated= true;
	    notifyAll();
	    }
	public synchronized void printeven() throws InterruptedException
	    {
		while(!No_generated||GenerateNo%2!=0) 
	    wait();
			System.out.print("square of"+GenerateNo+"="+GenerateNo*GenerateNo+"\n"); 
	      	
		No_generated=false;
	    }
   public synchronized void printodd() throws InterruptedException 
        {
	    while(!No_generated||GenerateNo%2==0) 
        wait();
	    System.out.print("cube of"+GenerateNo+"="+GenerateNo*GenerateNo*GenerateNo+"\n");
	    No_generated=false;
        } 
   }
class NumberGenerator extends Thread {
    Numbermanager Manager;
    public NumberGenerator(Numbermanager numbermanager)
      { 
      this.Manager = numbermanager; 
       }
   public void run() 
       {
	   while(true) {
		Manager.generatenumber();  
    	try {
        	Thread.sleep(1000);
    	}
      catch(InterruptedException e) {
    		 e.printStackTrace();
      }
    }}}
class EvenPrinterThread extends Thread {  //thread for printing even numbers
    Numbermanager Manager;
    public EvenPrinterThread (Numbermanager numbermanager)
      { 
      this.Manager = numbermanager;
       }
   public void run() 
       {
	   while(true) {
       try {
		Manager.printeven(); 
	} catch (InterruptedException e) {
		e.printStackTrace();
	}}}}
class OddPrinterThread extends Thread {  //thread for printing even numbers
    Numbermanager Manager;
    public OddPrinterThread (Numbermanager numbermanager)
      { 
      this.Manager = numbermanager;
       }
   public void run() 
       {
	   while(true) {
       try {
		Manager.printodd();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}}}}
    
  //-- MAIN CLASS

public class  Threads{
  public static void main(String []args) {      
	  Numbermanager Manager = new Numbermanager();
	  NumberGenerator Generator = new NumberGenerator(Manager);
	  EvenPrinterThread object1 = new EvenPrinterThread(Manager);
	  OddPrinterThread object2 = new OddPrinterThread(Manager);
	  Generator.start();  //calls No generator thread
	  object1.start();    //calls even printer thread
	  object2.start();    //calls odd printer thread
}
}









package javalab;

import java.util.Scanner;

public class abstractclass {
	public static void main(String  [] args)
	{
	int l ,br;
	float h,b,r;
	Scanner sc =new Scanner(System.in);
	rectangle rect =new rectangle();
	triangle tri =new triangle();
	hexagon hex = new hexagon();
	rect.numberofsides();
	tri.numberofsides();
	hex.numberofsides();
	}
	}
	abstract class shape {
	 public void numberofsides () {}
    }
    class rectangle extends shape {
    	public void numberofsides () {
    	System.out.println("no of sides of rectangle is 4");
    	}
    }
    class triangle extends shape {
    	public void numberofsides () {
    	System.out.println("no of sides of triangle is 3");
    	}
    }	
    class hexagon extends shape {
        public void numberofsides () {
        System.out.println("no of sides of hexagon is 6");	
        	}
    }
    
    
    
    
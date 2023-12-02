package javalab;

import java.util.Scanner;
import java.util.StringTokenizer;
public class stringtokenizer {
	public static void main(String[] args) {
		int sum=0,num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		String input=sc.nextLine();
		StringTokenizer obj=new StringTokenizer(input);
		
		int noOfTokens=obj.countTokens();
		
		while(obj.hasMoreTokens()) {
			 num=Integer.parseInt(obj.nextToken());
			 sum=sum+num;
		}
		System.out.println("Sum of "+noOfTokens+" Tokens is : "+sum);
		}

	}
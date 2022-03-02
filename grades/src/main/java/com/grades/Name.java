package com.grades;
import java.util.Scanner;

public class Name {

	void nameNames() {
		// TODO Auto-generated method stub
		System.out.println("enter your name:");
		Scanner s=new Scanner(System.in);
		String n1=s.next();
		int i=0;
		//System.out.println("enter h for horizontal ;v for vertical");
		//Scanner num=new Scanner(System.in);
		//String key=num.next();
		
		
			System.out.println("enter 1 for vertical print and 2 for horizontal print");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				while(i<10) {
				System.out.print(n1+" ");
				i++;}
				break;
			case 2:
				while(i<10) {
				System.out.println(n1);
				i++;}
				break;
			default:
				System.out.println("enter correct choice");
				
			}
			
			
		
		
		
		/*if(key.equals("h")) {
		while(i<=10) {
			System.out.println(n1);
			i++;
		}}
		else {
		while(i<n1.length()) {
			char letter=n1.charAt(i);
		
			System.out.println(letter + " ");
			i++;
		}
		}*/
		
	}

}

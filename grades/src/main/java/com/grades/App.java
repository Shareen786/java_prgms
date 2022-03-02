package com.grades;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	String s="y";
		
		while(s.equals("y")) {
		
		Scanner sc = new Scanner(System.in);// why scanner ans - to take input from user

		System.out.println("*******************MAIN MENU***************");
		System.out.println("press 1 for area of circle");
		System.out.println("press 2 for cube of 1-10 numbers");
		System.out.println("press 3 for deciding grade");
		System.out.println("press 4 for reverse of an integer");
		System.out.println("press 5 for printing name in horizontal and vertical way");
		System.out.println("press 6 to calculate average of n numbers");

		System.out.println("enter your choice");
		int ch = sc.nextInt();

		 //if a non static method like createProfile we want to call inside static so first we have to create object of class then we will call
											//because system will allocate memory for all static property but not allocate memory for non static properties

		Areac a=new Areac();
		Cube b=new Cube();
		Name c=new Name();
		Grade d=new Grade();
		Reverse e=new Reverse();
	
		switch (ch) {
		case 1:
			a.areaofcircle();
			break;
		case 2:
			b.cubesofnumbers();
			break;
		case 3:
			d.gradesOfstudents();
			break;
		case 4:
			e.reverseOfnumbers();
			break;
			
		case 5:
			c.nameNames();
			break;
		
			
		default:
			System.out.println("wrong choice");
    }
		System.out.println("do you want to continue press Y/N");
		s=sc.next();
		}
    }
}


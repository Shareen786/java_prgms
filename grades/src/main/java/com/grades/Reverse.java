package com.grades;
import java.util.Scanner;

public class Reverse {

	void reverseOfnumbers() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number:");
		int number = s.nextInt();
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}

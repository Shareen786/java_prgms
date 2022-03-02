package com.grades;
import java.util.Scanner;

public class Grade {

	void gradesOfstudents() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your grade:");
		int a =s.nextInt();
		
		if(a>=90){
			System.out.println("X Grade");
		}
		else if(a>=80){
			System.out.println("A Grade");
			
		}
		else if(a>=70) {
			System.out.println("B Grade");
		}
		else if(a>=60) {
			System.out.println("C Grade");
		}
		else if(a>=50) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}

	}

}

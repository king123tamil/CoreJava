package Calaculator_hw;

import java.util.Scanner;

public class Calculator {
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	int adds(int a,int b,int c) {
		return a+b-c;
	}
	int sub(int a,int b,int c) {
		return a-b-c;
	}
	int mul(int a,int b,int c) {
		return a*b*c;
	}
	int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Calculator calc=new Calculator();
		System.out.println("enter num1");
		
		int num1=sc.nextInt();
		System.out.println("entera a function to do a operation");
		char symbol1 = sc.next().charAt(0);
		System.out.println("enter num2");
		int num2=sc.nextInt();
		System.out.println("enter a char to do a function");
		char symbol2 = sc.next().charAt(0);
		System.out.println("enter num3");
		int num3=sc.nextInt();
		System.out.println("Enter your choice");
		char key = sc.next().charAt(0);
		
		if(symbol2=='-') {
			System.out.println("the addition value"+calc.adds(num1, num2, num3));
			
			
		}
		switch (key) {
		case '+': {
			System.out.println("the addition value"+calc.add(num1, num2, num3));
//			
//			System.out.println("the subtraction value is"+calc.sub(num1, num2, num3));
//			System.out.println("the division value is"+calc.div(num1, num2));
//			System.out.println("the multiply value is"+calc.mul(num1, num2, num3));
			
			
		}
		break;
		default:
			
		}
		
		
	
		
		
		
	}

}





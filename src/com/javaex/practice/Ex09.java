package com.javaex.practice;
import java.util.Scanner;
public class Ex09 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("화씨 : ");
		double f = sc.nextDouble();
		
		double a=5./9.*(f-32);
		System.out.printf("%f", a);
		
		sc.close();
	}

}

package com.javaex.practice;
import java.util.Scanner;
public class Ex13 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		
		System.out.printf("환전할 원화를 입력하세요 : ");
		double B = sc.nextDouble();
		
		A = B / 1230.95;
		
		System.out.printf("받으실 달러는 %f",A);
		
		sc.close();
		
	}

}

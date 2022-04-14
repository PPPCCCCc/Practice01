package com.javaex.practice;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		
		System.out.printf("반지름을 입력하세요 : ");
		double B = sc.nextDouble();
		
		A = B*B*3.14;
		
		System.out.printf("원의 넓이는 %.2f", A);
		
		sc.close();
		
	}

}

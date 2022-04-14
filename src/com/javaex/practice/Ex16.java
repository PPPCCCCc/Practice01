package com.javaex.practice;
import java.util.Scanner;
public class Ex16 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A,B;
		
		
		System.out.printf("상품가격 : ");
		double C =sc.nextDouble();
		
		System.out.println("받은돈 : ");
		double D =sc.nextDouble();
		
		A = C/10.0;
		B = D-C;
		
		System.out.printf("------\n" );
		System.out.printf("받은돈 : %.1f\n",D);
		System.out.printf("상품가격 : %.1f\n",C);
		System.out.printf("부가세 : %.1f\n", A);
		System.out.printf("잔액 : %.1f",B);
		
		sc.close();
		
	}

}

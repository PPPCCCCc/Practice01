package com.javaex.practice;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		
		System.out.printf("마일을 입력하세요 : ");
		double B = sc.nextDouble();
		
		A = B*1.609;
		
		System.out.printf("%.1f 마일은 ",B);
		System.out.printf("%f 킬로미터 입니다. ",A);
		
			
		sc.close();
		
	}

}

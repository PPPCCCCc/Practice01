package com.javaex.practice;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A,B;
		
		System.out.printf("가로를 입력하세요 : ");
		double C = sc.nextDouble();
		
		System.out.printf("세로를 입력하세요 : ");
		double D = sc.nextDouble();
		
		A = C*D;
		B = (C+D)*2;
		
		System.out.printf("사각형의 넓이는 %f\n", A);
		System.out.printf("사각형의 둘레는 %f", B);
		
		sc.close();
		
	}

}

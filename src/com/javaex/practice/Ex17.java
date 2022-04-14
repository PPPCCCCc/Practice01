package com.javaex.practice;
import java.util.Scanner;
public class Ex17 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		
		
		System.out.printf("화씨 : ");
		double C = sc.nextDouble();
		
		A = 5./9.*(C-32);
		
		System.out.printf("화씨 %.1f",C);
		System.out.printf("의 섭씨온도는 %f",A);
		System.out.printf("입니다");
		
		sc.close();
	}

}

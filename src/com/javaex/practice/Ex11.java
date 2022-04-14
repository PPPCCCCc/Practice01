package com.javaex.practice;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		int A;
				
		System.out.printf("월급을 입력하세요 : ");
		int B = sc.nextInt();
		
		A = B * 120;
		
		System.out.printf("10년동안 최대 저축액은 %d", A);
		System.out.printf(" 입니다");
		
		sc.close();
	}

}

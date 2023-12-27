package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int one = sc.nextInt();
		
		
		double two = (one*one*one-(9*one)+2);
		
		if(one <= 0) {
			System.out.println("계산결과는 "+ two +"입니다.");
		}else {
			double three = (7*one)+2;
			System.out.println("계산결과는 "+ three +"입니다.");
			
		}
		
		
		
		
		sc.close();
		
		
	}

}

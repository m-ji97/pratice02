package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호 : ");
		String one = sc.nextLine();
		System.out.print("숫자1: ");
		double two = sc.nextDouble();
		System.out.print("숫자2: ");
		double three = sc.nextDouble();
		
		if (two == 0){
		System.out.println("결과는: 계산할 수 없는 기호입니다");
		}
		
		
		if (one.equals("+")) {
			System.out.println("결과는: "+(two+three));
		}else if (one.equals("-")) {
			System.out.println("결과는: " +(two - three));
		}else if (one.equals("*")) {
			System.out.println("결과는: "+(two*three));
		}else if (one.equals("/")) {
			System.out.println("결과는: "+(two/three));
		}else
		
		sc.close();
	
	}

}

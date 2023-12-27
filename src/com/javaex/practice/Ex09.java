package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요");
		System.out.print("년도: ");
		int age = sc.nextInt();
		int age1 = 2023-age;
		
		if(age1 >=15 && age1 > 65) {
			System.out.println(age1+"살 무료예방접종 대상자 입니다");
			
		}else {
			System.out.println(age1+"살 무료예방접종 대상자가 아닙니다");
		}
					
		sc.close();
	}

}

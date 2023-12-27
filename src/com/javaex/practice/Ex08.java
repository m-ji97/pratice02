package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int tall = sc.nextInt();
		System.out.print("몸무게: ");
		int kg01 = sc.nextInt();
		double free = 72.0;
		
		double kg02 = (tall-100)*0.9;
		
		if (kg01 <= kg02 && kg01 <= 60) {
			System.out.println("저체중 입니다.");
		}else if (kg01 <= 80) {
			System.out.println("표준체중 입니다.");
		}else if (kg01 <= 120) {
			System.out.println("과체중 입니다.");
		}
		System.out.println("표준체중:"+free);
		sc.close();
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex23_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도 를 입력해 주세요");
		System.out.print("년도: ");
		int one = sc.nextInt();
		System.out.print("올해: ");
		int two = sc.nextInt();
		System.out.print("태어난해: ");
		int three = sc.nextInt();
		System.out.print("나이: ");
		int fore = sc.nextInt();
		int five = two-one;
		System.out.println("===========================");
		
	if (five >=20) {
		System.out.println("20살이상");
		System.out.println("건강검진해 아님");
		}else if(five < 20 ) {
		System.out.println("20살이상");
		System.out.println("건강검진해 아님");
	
	}

}
}

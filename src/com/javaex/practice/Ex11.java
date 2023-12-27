package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int one = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int two = sc.nextInt();
		int three = one/two;
		System.out.print("몫: "+three);
		int fore = one%two;
		System.out.println();
		System.out.print("나머지: "+fore);
		
		
		sc.close();
	}

}

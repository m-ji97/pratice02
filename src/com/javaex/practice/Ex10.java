package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int first1 = sc.nextInt();
		System.out.print("숫자2: ");
		int first2 = sc.nextInt();
		
		if (first1<first2) {
			System.out.println("큰수: "+first2+ "작은수: "+first1);
		}else if(first1>first2) {
			System.out.println("큰수: "+first1+ "작은수: "+first2);
		}
		
		 sc.close();
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int one = sc.nextInt();
		System.out.print("숫자2: ");
		int two = sc.nextInt();
		System.out.print("숫자3: ");
		int three = sc.nextInt();
		
		if (one > two) {
			System.out.print("가장 큰수는 "+one+" 입니다.");
		}else if (two > three) {
			System.out.print("가장 큰수는 "+two+" 입니다.");
		}else if (three> two) {
			System.out.print("가장 큰수는 "+three+" 입니다.");
		}
		
		
		sc.close();
	}

}

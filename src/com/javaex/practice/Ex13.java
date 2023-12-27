package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int one = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int two = sc.nextInt();
		
		if (two%one==0) {
			System.out.println(two+" 는(은) "+one+" 의 약수입니다");
		}else{
			System.out.println(two+" 는(은) "+one+" 의 약수가 아닙니다");
		}
		
		sc.close();
		
	}

}

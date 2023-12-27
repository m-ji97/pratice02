package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double one = sc.nextDouble();
		
		if(0<one && one<=1000){
			double two = 0.09*one;
			System.out.println("소득세는: "+two+" 입니다");
		}else if(one<=4000) {
			double three = 1000*0.09+0.18*(one-1000);
			System.out.println("소득세는: "+three+" 입니다");
		}else if (one< 8000) {
			double fore = 1000*0.09+0.27*(one-4000);
			System.out.println("소득세는: "+fore+" 입니다");
		}else if (8000 < one){
			double five = (1000*0.09)+3000*0.18+4000*0.27+0.36*(one-8000);
			System.out.print("소득세는: "+five+" 입니다");
		}
		sc.close();
		
	}
}

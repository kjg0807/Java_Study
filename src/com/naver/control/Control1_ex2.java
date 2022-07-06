package com.naver.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// 숫자 입력시 짝수 홀수 출력 단일 if문 1번만 사용
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("===홀짝 판별 프로그램===");
			System.out.println("양수를 입력하시오.");
			int a = sc.nextInt();
			String b = "홀수입니다.";
			//-------------------------------------------------------
			if (a % 2 == 0) {
				//System.out.println("짝수입니다.");
				b = "짝수입니다.";
			}
			System.out.println(b);
			//-------------------------------------------------------
			System.out.println(a % 2 == 0 ? "짝수" : "홀수");
			
			System.out.println("프로그램을 종료하려면 !를 입력하시오.(실행하려면 아무키나 입력)");
			String c = sc.next();
			if (c.equals("!")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

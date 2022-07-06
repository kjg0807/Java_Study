package com.naver.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		// 제어문 if, else if, else
		// 1. 단일 if문
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if (num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
		System.out.println("finish");
	}

}

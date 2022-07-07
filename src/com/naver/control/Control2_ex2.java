package com.naver.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// 알파벳 순서: a b c d e f g h i j k l m n o p q r s t u v w x y z
		// 설정한 알파벳에서 설정한 숫자만큼 뒤의 알파벳을 사용
		// char ch = 'a'; 2기준 a => c

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1~5 사이의 숫자 입력");
			int num = sc.nextInt();
			// num = 1 -> ch = c
			// num = 2 -> ch = d
			System.out.println("알파벳 입력");
			char ch = sc.next().charAt(0);

			int rs = ch + num;

			// 소문자 z를 넘어갔을 때 소문자 a로 넘어가게 하는 코드
			if (rs > 'z') { // 아스키코드 - 122 = z
				rs = rs - 'z'; // if rs = 2 z -> b
				rs = 'a' + rs - 1; // 아스키코드 96 -> a 이전 (a: 97)
			}
			// 대문자 z를 넘어갔을 때 대문자 a로 넘어가게 하는 코드
			if (rs > 'Z' && rs < 'a') {
				rs = rs - 'Z';
				rs = 'A' + rs - 1;
			}
			ch = (char) rs;

			System.out.println("ch: " + ch);
			
			System.out.println("!를 입력하면 프로그램 종료 (실행하려면 아무키나 입력)");
			String z = sc.next();
			if(z.equals('!')) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		// Home Edition +++++++++
		// Study Edition
	}
}

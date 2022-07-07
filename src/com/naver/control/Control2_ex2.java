package com.naver.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// 알파벳 순서: a b c d e f g h i j k l m n o p q r s t u v w x y z
		// 설정한 알파벳에서 설정한 숫자만큼 뒤의 알파벳을 사용
		// char ch = 'a'; 2기준 a => c
		Scanner sc = new Scanner(System.in);

		System.out.println("1~5 사이의 숫자 입력");
		int num = sc.nextInt();
		// num = 1 -> ch = c
		// num = 2 -> ch = d
		System.out.println("알파벳 입력");
		char ch = sc.next().charAt(0);
		// charAt(0) - str이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다
		/*
		 * String str = new String();
		 * 
		 * char c = ' ';
		 * 
		 * str = "안녕하세요";
		 * 
		 * c = str.charAt(0);
		 * 
		 * System.out.println(c);
		 */

		ch = (char) (ch + num);
		if(ch == 123) {
			ch = 97;
			ch = (char)ch;
		}		
		System.out.println(ch);

		//ch = (char) (ch + num);
		
		System.out.println(ch+1);
		
		//Home Edition +++++++++
	}
	//Study Edition
}

package com.naver.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		System.out.println("1~3 사이의 숫자를 입력");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("1번 선택");
		}
		else if(sel == 2) {
			System.out.println("2번 선택");
		}
		else if(sel == 3) {
			System.out.println("3번 선택");
		}
		else {
			System.out.println("범위외의 숫자를 선택함");
		}
	}
}

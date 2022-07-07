package com.naver.loop;

import java.util.Scanner;

public class Loop1_ex2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 1. 1번선택 대문자 A ~ Z 출력 -- 2번선택 소문자 a ~ z 출력
		// -> 1번 대문자 2번 소문자 선택하면 바로 대소문자 구별하여 (반복문)출력
		System.out.println("1번: 대문자출력, 2번: 소문자출력");
		int a = sc.nextInt(); // 1번과 2번을 선택하기 위해 입력받음
		// if (a == 1)
		// {
		// for (int i = 0; i < 26; i++)
		// {
		// System.out.print((char) ('A' + i) + " ");
		// }
		// } else if (a == 2)
		// {
		// for (int i = 0; i < 26; i++)
		// {
		// System.out.print((char) ('a' + i) + " ");
		// }
		// }
		for (int i = 0; i < 26; i++) // 알파벳 총 26개
		{
			if (a == 1)
			{
				int b = 'A'; // 아스키코드 A
				System.out.print((char) (b + i) + " "); // 아스키코드 A에서 1씩 더하고 문자형으로 출력
			} else if (a == 2)
			{
				int b = 'a'; // 아스키코드 a
				System.out.print((char) (b + i) + " "); // 아스키코드 a에서 1씩 더하고 문자형으로 출력
			}
		}
		System.out.println();
		System.out.println();
		// 2. 1 ~ 10 합구하기
		// 반복문 1 ~ 10 합
		System.out.println("1 ~ 10까지의 합");
		int sum = 0;
		for (int i = 1; i < 11; i++)
		{
			sum = sum + i; // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		}
		System.out.println(sum);
		System.out.println();

		// 3. ID, Pwd 입력하여, 로그인 판단 최대 5번까지 시도가능
		// 최대 5번까지 입력할 수 있도록 반복문 설정 (중간에 로그인 성공시 프로그램 종료)
		int Id = 1234; // 회원가입시 입력한 아이디
		int pwd = 1234; // 회원가입시 입력한 패스워드

		System.out.println("===로그인 하기 위한 정보 입력(5번 오류시 로그인 실패)===");
		loop: for (int i = 1; i < 6; i++)
		{
			System.out.println("아이디 입력");
			int yId = sc.nextInt();
			if (yId == Id)
			{
				System.out.println("--아이디 일치--");
				System.out.println("비밀번호 입력");
				for (int j = 1; j < 6; j++)
				{
					int ypwd = sc.nextInt();
					if (ypwd == pwd)
					{
						System.out.println("비밀번호 일치");
						System.out.println("---로그인 성공!!---");
						break loop;
					} else
					{
						System.out.println("비밀번호 틀림(재입력)" + j + "회");
					}
					if (j == 5)
					{
						System.out.println("===로그인 실패===");
						break loop;
					}
				}
			} else
			{
				System.out.println("아이디 틀림(재입력)" + i + "회");
			}
			if (i == 5)
			{
				System.out.println("===로그인 실패===");
				break loop;
			}
		}
	}
}
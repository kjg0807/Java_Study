package com.naver.loop;

import java.util.Scanner;

public class Loop5
{

	public static void main(String[] args)
	{
		// int i = 0;
		// while (i < 5)
		// {
		// System.out.println("hello world");
		// i++;
		// }
		Scanner sc = new Scanner(System.in);

		boolean check = true;

		while (check)
		{
			System.out.println("1. 성적 입력, 2. 총점 계산, 3. 평균 계산, 4. 종료");

			int sel = sc.nextInt();
			if (sel == 1)
			{
				System.out.println("성적입력 선택");
			}
			else if (sel == 2)
			{
				System.out.println("총점계산 선택");
			}
			else if (sel == 3)
			{
				System.out.println("평균계산 선택");
			}
			else if (sel == 4)
			{
				System.out.println("프로그램 종료");
				check = false;
			}
			else
			{
				System.out.println("1 ~ 4만 입력");
			}
		}
	}
}

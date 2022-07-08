package com.naver.loop;

import java.util.Scanner;

public class Loop4_ex2
{

	public static void main(String[] args)
	{
		// FPS - 총알 - 탄창: 30발 3개 - 30발 쏜 후 재장전
		// 1. 단발(1회 1번) 2. 점사(1회 3번)

		Scanner sc = new Scanner(System.in);

		// 강사님코드
		// System.out.println("총 쏘는 프로그램 (30발, 3번)");
		// System.out.println("1. 단발, 2. 점사");
		// int sel = sc.nextInt();
		// int inc = 3;
		// String sound = "타타탕";
		//
		// if (sel == 1)
		// {
		// inc = 1;
		// sound = "탕";
		// }
		// for (int b = 0; b < 30; b = b + inc)
		// {
		// System.out.println(sound);
		// }

		// 내가 한것
		for (int z = 0; z < 3; z++) // 탄창 3번 사용
		{
			System.out.println("총 쏘는 프로그램 (30발, 3번)");
			System.out.println("1. 단발, 2. 점사");
			int sel = sc.nextInt();
			int one = 31;

			if (sel == 1)
			{
				System.out.println("단발 선택");
				System.out.println("사격하려면 1 입력");
				int shot = sc.nextInt();
				// 1을 입력시 탕 1번 출력
				for (int i = 1; i < one; i++)
				{
					if (shot == 1)
					{
						System.out.println("탕" + i + " = " + i + "발");
					}
				}
			}
			else if (sel == 2)
			{
				System.out.println("점사 선택");
				System.out.println("사격하려면 1 입력");
				int shot = sc.nextInt();
				// 1을 입력시 탕 1번 출력
				for (int i = 1; i < one; i++)
				{
					one = 11;
					if (shot == 1)
					{
						System.out.println("탕탕탕" + i + " = " + i * 3 + "발");
					}
				}
			}
			// 다른 것을 입력했을때 오류라고 출력하고 다시 처음부터 실행
			if (z == 0)
			{
				System.out.println("--30발 사격, 탄창 1개 소모--");
				System.out.println("30발 사격 완료 재장전");
			}
			else if (z == 1)
			{
				System.out.println("--60발 사격, 탄창 2개 소모--");
				System.out.println("30발 사격 완료 재장전");
			}
			else if (z == 2)
			{
				System.out.println("--90발 사격완료, 탄창 전부 소모--");
			}
		}
	}
}

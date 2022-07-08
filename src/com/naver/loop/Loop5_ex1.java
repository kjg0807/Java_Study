package com.naver.loop;

import java.util.Scanner;

public class Loop5_ex1
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int Id = 12;
		int Pwd = 34;
		// 로그인 성공하면 중료 실패시 다시 입력
		boolean ch = true;
		boolean flag = false;

		loop: while (ch) // ()안에 true 사용시 switch-case 문일때 break;하지 못함
		{
			System.out.println("로그인: Id입력, PWD입력");
			int id = sc.nextInt();
			int pwd = sc.nextInt();

			String s;
			if (Id == id && Pwd != pwd)
			{
				System.out.println("---ID 일치, PWD 불일치(재입력)---");
				System.out.println("프로그램을 종료하려면 !입력(재입력하려면 아무키나 입력)");
				s = sc.next();
				if (s.equals("!"))
				{
					break loop;
				}
			}
			else if (Id != id && Pwd == pwd)
			{
				System.out.println("---ID 불일치, PWD 일치(재입력)---");
				System.out.println("프로그램을 종료하려면 !입력(재입력하려면 아무키나 입력)");
				s = sc.next();
				if (s.equals("!"))
				{
					break loop;
				}
			}
			else if (Id != id && Pwd != pwd)
			{
				System.out.println("---ID 불일치, PWD 불일치(재입력)---");
				System.out.println("프로그램을 종료하려면 !입력(재입력하려면 아무키나 입력)");
				s = sc.next();
				if (s.equals("!"))
				{
					break loop;
				}
			}
			else if (Id == id && Pwd == pwd)
			{
				System.out.println("---로그인 성공---");
				break;
			}
		}

		// ------------------------------------------------------------------------------------
		// 로그인 성공하면 중료 실패시 다시 입력
		// 로그인 안하면 프로그램 종료
		// 로그인 성공하면 게임 시작
		// RPG 시작 레벨 1 - 만렙 15
		// gold : 1000;
		// 모든 몬스터 경험치 동일
		// 레벨 1 -> 2 : 3마리 - 사냥 print문 3번(몬스터 수와 동일) - 레벨 업
		// 레벨 2 -> 3 : 6마리
		// 3 -> 4 : 9마리
		// 4 -> 5 : 12마리
		// 6 -> 7 : 15마리
		// ...
		// 14 -> 15 : ..마리 - 만렙 도달 -> 종료
		// 5, 10, 15레벨 달성시 1000, 2000, 3000gold 지급

		loop: while (ch)
		{
			System.out.println("게임을 시작합니다.");
			System.out.println("시작하시겠습니까? 1. 시작, 2. 종료");
			int start = sc.nextInt();
			if (start == 1)
			{
				System.out.println("---게임시작---");
				System.out.println("레벨 1, 보유 금액: 1000골드");
				System.out.println("(자동)사냥을 통해 레벨업합니다.");

				// 1레벨 시작
				// 레벨 1 -> 2 : 3마리 - 사냥 print문 3번(몬스터 수와 동일) - 레벨 업
				// 레벨 2 -> 3 : 6마리
				// 3 -> 4 : 9마리
				// 4 -> 5 : 12마리
				// 6 -> 7 : 15마리
				int i;
				int level = 251;
				int gold = 1000;

				for (i = 10; i < level; i++)
				{
					System.out.println("축하합니다. 레벨 '" + i + "' 달성!");
					System.out.println("잡은 몬스터 수: " + (i * 3 - 3));

					if (i % 5 == 0)
					{
						System.out.println((i) + "레벨 기념으로 " + "골드를 지급합니다.");
						gold = gold + i / 5 * 1000;
					}
					System.out.println("총 골드는: " + gold);
				}

				// ---만렙이후---
				System.out.println("---만렙에 도달하였습니다.---");
				System.out.println("---1초에 1마리씩 자동사냥합니다.---");
				// 몬스터 무한루프
				int num = 0, sum = 0;
				while (ch)
				{
					System.out.println("잡을 몬스터 수를 입력(0입력시 종료) >>");
					num = sc.nextInt();
					if (num == 0)
					{
						System.out.println("게임 종료");
						break loop;
					}
					if (num != 0)
					{
						sum += num;
					}
					else
					{
						ch = false;
					}
					for (int z = 1; z <= sum; z++)
					{
						Thread.sleep(500);
						if (z % 10 == 0)
						{
							System.out.println(z + "마리 달성!");
						}
						System.out.println("총 잡은 마리수: " + z);
					}
					if (num == 0)
					{
						System.out.println("게임을 종료합니다.");
						break loop;
					}
				}
			}
			else if (start == 2)
			{
				System.out.println("게임을 종료합니다.");
				ch = false;
			}
		}
	}
}

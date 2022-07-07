package com.naver.loop;

public class Loop2
{

	public static void main(String[] args)
	{
		// 반복문의 보조문
		// 1. break - 반복문 내에서 break를 만나면 그 즉시 반복문을 종료
		// 2. continue - 반복문 내에서 continue를 만나면
		// - continue 밑에 코드쓰면 에러(unreachable code - 도달할 수 없는 코드)
		// for문 - 즉시 증감식으로 이동 -- while문 - 즉시 조건식으로 이동

		System.out.println("---continue문---");

		for (int i = 0; i < 10; i++)
		{
			if (i % 2 != 0)
			{
				continue; //밑의 모든 코드를 실행하지 않는다.
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---break문---");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(i + " ");
			if (i == 5)
			{
				break;
			}
		}
	}
}

package com.naver.loop;

public class Loop4
{

	public static void main(String[] args) // 메인 메서드
	{		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < 5; i++) // 세로
		{
			for (int j = i; j < 5; j++) // 가로
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

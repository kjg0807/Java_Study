package com.naver.loop;

public class Loop3
{

	public static void main(String[] args)
	{
		//
		for (int i = 0; i < 10; i++)
		{
			System.out.println("1. 대문자, 2. 소문자, 3. 종료");

			int sel = 1;
			switch (sel)
			{
				case 1:
				{
					System.out.println("대문자");
					break;
				}
				case 2:
				{
					System.out.println("소문자");
					break;
				}
				default:
				{
					System.out.println("프로그램 종료");
					break;
				}
			}
		}

	}

}

package com.naver.control;

public class Control4
{

	public static void main(String[] args)
	{
		//
		// int sel = 3;
		String sel = "abc";

		switch (sel)
		{
			case "a":
			{
				System.out.println("1일때 진행");
				break;
			}
			case "abc":
			{
				System.out.println("2일때 진행");
				break;
			}
			default:
			{
				System.out.println("그 외 나머지 진행");
			}
		}
	}

}

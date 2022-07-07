package com.naver.loop;

import java.util.Scanner;

public class Loop_ex1
{

	public static void main(String[] args)
	{
		// 0-9 출력 단, 출력은 짝수만

		for (int i = 0; i < 10; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		// 0-9 출력 단, 출력은 짝수만 if문 사용x
		for (int i = 0; i < 10; i = i + 2)
		{
			System.out.print(i + " ");
			// i++;
		}
		// 멍멍 출력 -> 입력한 숫자만큼 출력
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("반복할 횟수 입력");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++)
		{
			System.out.println("머엉");
		}
	}
}

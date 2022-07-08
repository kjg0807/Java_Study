package com.naver.loop;

import java.util.Scanner;

public class Loop4_ex1
{

	public static void main(String[] args)
	{
		// 입력받은 시간에 시계종료 ex) 2시 1분 15초때 종료 (숫자 입력받기)
		Scanner sc = new Scanner(System.in);
		// System.out.println("시 입력");
		// int H = sc.nextInt();
		// System.out.println("분 입력");
		// int M = sc.nextInt();
		// System.out.println("초 입력");
		// int S = sc.nextInt();

		// for (int h = 0; h < 25; h++)
		// {
		// if (h < H)
		// {
		// // System.out.print(h + "시");
		// }
		// for (int m = 0; m < 60; m++) // 분
		// {
		// if (m < M)
		// {
		// // System.out.print(m + "분");
		// }
		// if (m == 60)
		// {
		// m = 0;
		// }
		// for (int s = 0; s < 60; s++) // 초
		// {
		// System.out.println(s);
		// // System.out.println(h + "시" + " : " + m + "분" + " : " + s + "초");
		// if (s == 60)
		// {
		// s = 0;
		// }
		// }
		// }
		// }
		
		// ------------강사님 코드------------
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();

		boolean flag = false;

		for (int i = 0; i < 60; i++)
		{
			for (int j = 0; j < 60; j++)
			{
				System.out.println(i + "분 : " + j + "초");
				if (m == i && s == j)
				{
					flag = !flag;
					// i = 60;
					break;
				}
			}
			if (flag)
			{
				break;
			}
		}
	}

}

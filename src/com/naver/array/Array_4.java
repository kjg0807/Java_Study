package com.naver.array;

import java.util.Scanner;

public class Array_4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		int i;
		
		for (i = 0; i < nums.length; i++)
		{
			System.out.println(i + " 번 인덱스 값 입력");
			nums[i] = sc.nextInt();
		}
		for (i = 0; i < nums.length; i++)
		{
			System.out.println(i + " 번 인덱스 값 출력: " + nums[i]);
		}
	}
}

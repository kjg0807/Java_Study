package com.naver.array;

import java.util.Scanner;

public class Array_1
{

	public static void main(String[] args)
	{
		// 배열 선언
		// 데이터 타입 [] 변수명 = new 데이터 타입[숫자];
		int age = 30;
		int[] nums = new int[3];		
		char[] names = new char[2];
		Scanner sc = new Scanner(System.in);		

		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
		names[0] = 'z';
		names[1] = '한';		
		
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[1]);
		System.out.println(nums[0]);
		System.out.println(nums[2]);
		System.out.println(names[0]);
		System.out.println(names[1]);
	}
}

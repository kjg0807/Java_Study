package com.naver.array;

public class Array_6
{

	public static void main(String[] args)
	{
		int i;
		int[] nums = { 1, 2, 3 };
		int[] copy = new int[nums.length - 1];

		for (i = 0; i < copy.length; i++)
		{
			copy[i] = nums[i];
			System.out.println(copy[i]);
		}
		nums = copy;

		System.out.println(nums.length);
//
//		for (i = 0; i < nums.length; i++)
//		{
//			System.out.println(nums[i]);
//		}
	}
}

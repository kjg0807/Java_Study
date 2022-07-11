package com.naver.array;

public class Array_3
{

	public static void main(String[] args)
	{
		int[] num = new int[3]; //Stack에 Heap으로 가기 위한 배열 주소가 들어감

		num[0] = 100;
		num[1] = 200;
		num[2] = 300; //num[0,1,2] Heap에 배열 내용에 들어감
		int[] num2 = num;
		
		System.out.println(num2[2]);
	}
}

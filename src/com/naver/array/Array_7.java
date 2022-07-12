package com.naver.array;

public class Array_7
{

	public static void main(String[] args)
	{
		int i;
		int[] ar = { 4, 3, 7, 1, 9 };
		// 내림 차순 9, 7, 4, 3, 1
		// i=0 , 1234
		// i=1 , 234
		// i=2 , 34
		// i=3 , 4
		for (i = 0; i < ar.length - 1; i++)
		{
			for (int j = i + 1; j < ar.length; j++)
			{
				if (ar[i] < ar[j])
				{
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[i] = tmp;
				}
			}
			for (i = 0; i < ar.length; i++)
			{
				System.out.println(ar[i]);
			}
		}

		// for (i = 0; i < ar.length; i++)
		// {
		// System.out.println(ar[i]);
		// }
	}

}

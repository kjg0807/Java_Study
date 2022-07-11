package com.naver.array;

import java.util.Scanner;

public class Array_ex1
{

	public static void main(String[] args)
	{
		// 키보드로 인원 수 입력, 인원 수 만큼 이름 입력, 입력한 이름을 출력

		Scanner sc = new Scanner(System.in);

		int peo;
		int i;

		System.out.println("인원 수만큼 이름 입력 후 출력");
		System.out.println("인원 수 입력");
		peo = sc.nextInt();

		String[] name = new String[peo];
		int[] kor = new int[peo];
		int total = 0;

		for (i = 0; i < name.length; i++)
		{
			System.out.println((i + 1) + " 번째 이름을 입력");
			name[i] = sc.next();
		}
		// 학생 이름별 국어점수 입력 + 출력
		// ex) 누구의 국어 점수 입력
		for (i = 0; i < kor.length; i++)
		{
			System.out.println(name[i] + " 의 국어점수 입력");
			kor[i] = sc.nextInt();
		}
		System.out.println("");
		for (i = 1; i < name.length; i++)
		{
			System.out.println("입력한 인원 수: " + (i + 1) + "명");
		}
		for (i = 0; i < name.length; i++)
		{
			System.out.println("입력한 이름: " + name[i] + ", 국어 점수: " + kor[i]);
		}
		// 반의 국어 총점을 계산하고 출력
		for (i = 0; i < name.length; i++)
		{
			total = total + kor[i];
		}
		System.out.println("반의 국어 총점은: " + total);
	}
}

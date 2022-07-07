package com.naver.control;

import java.util.Scanner;

public class Control4_ex1
{

	public static void main(String[] args)
	{
		// 국어 영어 수학 입력 -> 총점 평균
		// 평균 90점이상 A, 80이상 B, 70이상 C, 60이상 D, 그 외 F
		// switch - case

		Scanner sc = new Scanner(System.in);
		while (true)
		{

			System.out.println("국어점수 입력");
			int kor = sc.nextInt();
			System.out.println("영어점수 입력");
			int eng = sc.nextInt();
			System.out.println("수학점수 입력");
			int math = sc.nextInt();

			int sum = kor + eng + math;
			if (sum > 300)
			{
				System.out.println("점수 오류");
				break;
			}
			int avg = sum / 3;
			switch (avg / 10)
			{
				case 10:				
				case 9:
				{
					System.out.println("A");
					break;
				}
				case 8:
				{
					System.out.println("B");
					break;
				}
				case 7:
				{
					System.out.println("C");
					break;
				}
				case 6:
				{
					System.out.println("D");
					break;
				}
				default:
				{
					System.out.println("F");
				}
			}
			System.out.println("!입력시 프로그램 종료(아무키 입력시 실행)");
			String z = sc.next();
			if (z.equals("!"))
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}

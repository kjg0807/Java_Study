package com.naver.control;

import java.util.Scanner;

public class Control3_ex1
{
	public static void main(String[] args)
	{
		// 국어 영어 수학 입력 -> 총점 평균
		// 평균 90점이상 A, 80이상 B, 70이상 C, 60이상 D, 그 외 F		
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("===세 과목의 총점, 평균 계산===");
			System.out.println("각 과목의 만점은 100");
			System.out.println("국어 점수를 입력");
			int kor = sc.nextInt();
			System.out.println("영어 점수를 입력");
			int eng = sc.nextInt();
			System.out.println("수학 점수를 입력");
			int math = sc.nextInt();

			int sum = kor + eng + math;
			if (sum > 300)
			{
				System.out.println("점수를 잘못 입력함 - 프로그램 종료");
				break;
			}
			double avg = sum / 3.0;

			if (avg >= 90)
			{
				System.out.println("총점: " + sum + "평균: " + avg);
				System.out.println("학점: A");
			} else if (avg >= 80)
			{
				System.out.println("총점: " + sum + "평균: " + avg);
				System.out.println("학점: B");
			} else if (avg >= 70)
			{
				System.out.println("총점: " + sum + "평균: " + avg);
				System.out.println("학점: C");
			} else if (avg >= 60)
			{
				System.out.println("총점: " + sum + "평균: " + avg);
				System.out.println("학점: D");
			} else
			{
				System.out.println("총점: " + sum + "평균: " + avg);
				System.out.println("학점: F");
			}
			System.out.println("!입력시 프로그램 종료");
			String z = sc.next();
			if (z.equals('!'))
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

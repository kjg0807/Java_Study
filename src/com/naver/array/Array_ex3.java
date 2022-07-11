package com.naver.array;

import java.util.Scanner;

public class Array_ex3
{

	public static void main(String[] args)
	{
		// 학생 정보 프로그램
		// 1. 입력 - 학생 수를 입력 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
		// 2. 조회 - 모든 학생의 이름, 번호, 총점, 평균 출력
		// 3. 검색 - 검색할 학생 번호를 입력, 입력한 번호와 일치하는 학생의 정보(이름, 번호, 총점, 평균) 출력 (번호 없으면 재입력)
		// 4. 삭제 - 삭제할 학생 번호 입력, 입력한 번호와 일치하는 학생정보 삭제(배열 한칸 삭제 - 배열을 새로 만든다?) (번호 없으면
		// 재입력)
		// 5. 추가 - 이름, 번호, 국어, 영어, 수학, 입력 후, 총점, 평균 계산
		// 6. 프로그램 종료 -
		Scanner sc = new Scanner(System.in);

		boolean ch = true;
		while (ch)
		{
			int total = 0;
			double avg = 0;
			String[] name = null;
			int[] number = null;
			int[] kor = null;
			int[] eng = null;
			int[] math = null;

			System.out.println("---학생 정보 프로그램---");
			System.out.println("1. 정보 입력, 2. 정보 조회, 3. 정보 검색, 4. 정보 삭제, 5. 정보 추가, 6. 프로그램 종료");
			int con = sc.nextInt();
			int i;

			// 1. 입력 - 학생 수를 입력 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
			// 이름
			int stu = 0;

			if (con == 1) // 정보 입력
			{
				System.out.println("저장할 학생 수 입력");
				stu = sc.nextInt();
				total = 0;
				avg = 0;
				name = new String[stu];
				number = new int[stu];
				kor = new int[stu];
				eng = new int[stu];
				math = new int[stu];

				for (i = 0; i < stu; i++)
				{
					System.out.println((i + 1) + " 번째 이름을 입력");
					name[i] = sc.next();
					// 번호
					System.out.println((i + 1) + " 번째 번호을 입력");
					number[i] = sc.nextInt();
					// 국어
					System.out.println((i + 1) + " 번째 국어점수 입력");
					kor[i] = sc.nextInt();
					// 영어
					System.out.println((i + 1) + " 번째 영어점수 입력");
					eng[i] = sc.nextInt();
					// 수학
					System.out.println((i + 1) + " 번째 수학점수 입력");
					math[i] = sc.nextInt();
					// 총점, 평균
					total = total + (kor[i] + math[i] + eng[i]);
					avg = (double) total / 3.0;
					System.out.println("이름: " + name[i] + " 총점: " + total + "점" + " 평균: " + avg + "점");
				}
			}
			else if (con == 2) // 정보 조회
			{
				for (i = 0; i < stu; i++)
				{
					System.out.println("이름: " + name[i] + "번호: " + number[i] + "국어점수: " + kor[i] + "영어점수: " + eng[i] + "수학점수: " + math[i] + " 총점: " + total + "평균: " + avg);
				}
			}
			else if (con == 3) // 정보 검색
			{
				System.out.println("정보검색");
			}
			else if (con == 4) // 정보 삭제
			{
				System.out.println("정보삭제");
			}
			else if (con == 5) // 정보 추가
			{
				System.out.println("정보추가");
			}
			else if (con == 6) // 프로그램 종료
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

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
		String[] name = null;
		int[] number = null;
		int[] kor = null;
		int[] eng = null;
		int[] math = null;
		int[] total = null;
		double[] avg = null;
		boolean ch = true;

		loop: while (ch)
		{
			System.out.println("---학생 정보 프로그램---");
			System.out.println("1. 정보 입력, 2. 정보 조회, 3. 정보 검색, 4. 정보 삭제, 5. 정보 추가, 6. 프로그램 종료");
			int sel = sc.nextInt();
			int i;

			// 1. 입력 - 학생 수를 입력 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
			// 이름
			if (sel == 1) // 정보 입력
			{
				System.out.println("저장할 학생 수 입력");
				sel = sc.nextInt();

				name = new String[sel];
				number = new int[name.length];
				kor = new int[name.length];
				eng = new int[name.length];
				math = new int[name.length];
				total = new int[name.length];
				avg = new double[name.length];

				for (i = 0; i < name.length; i++)
				{
					System.out.println((i + 1) + " 번째 이름 입력");
					name[i] = sc.next();
					// 번호
					System.out.println((i + 1) + " 번째 번호 입력");
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
					total[i] = kor[i] + math[i] + eng[i];
					avg[i] = (double) total[i] / 3.0;
					System.out.println("---정보 입력 완료---");
					System.out.println("");
				}
			}
			else if (sel == 2) // 정보 조회
			{
				if (name != null)
				{
					System.out.println("Name\tNumber\tTotal\tAvg");
					for (i = 0; i < name.length; i++)
					{
						System.out.println(name[i] + "\t" + number[i] + "\t" + total[i] + "\t" + avg[i]);
					}
					System.out.println("정보 출력 완료");
				}
				else
				{
					System.out.println("---학생 정보가 없음---");
				}
			}
			else if (sel == 3) // 정보 검색
			{
				// System.out.println("정보검색");
				System.out.println("검색할 학생 번호 입력");
				sel = sc.nextInt();
				boolean flag = false;
				for (i = 0; i < name.length; i++)
				{
					if (sel == number[i])
					{
						System.out.println("Name\tNumber\tKor\tEng\tMath\tTotal\tAvg");
						System.out.println(name[i] + "\t" + number[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + total[i] + "\t" + avg[i]);
						System.out.println("입력한 번호의 정보 출력");
						System.out.println("");
						flag = !flag;
						break;
					}
					else
					{
						System.out.println("일치하는 학생 정보 없음");
					}
				}
			}
			else if (sel == 4) // 정보 삭제
			{
				// System.out.println("정보삭제");
				System.out.println("삭제할 학생 번호 입력");
				sel = sc.nextInt();
				boolean flag = false;

				String[] nameCopy = null;
				int[] numberCopy = null;
				int[] korCopy = null;
				int[] engCopy = null;
				int[] mathCopy = null;
				int[] totalCopy = null;
				double[] avgCopy = null;
				for (i = 0; i < name.length; i++)
				{
					if (sel == number[i])
					{
						flag = !flag;
						break;
					}
				}
				if (flag)
				{
					nameCopy = new String[name.length - 1];
					numberCopy = new int[nameCopy.length];
					korCopy = new int[nameCopy.length];
					engCopy = new int[nameCopy.length];
					mathCopy = new int[nameCopy.length];
					totalCopy = new int[nameCopy.length];
					avgCopy = new double[nameCopy.length];
					int index = 0;
					for (int j = 0; j < name.length; j++)
					{
						if (j == 1)
						{
							//index--;
							continue;
						}
						nameCopy[index] = name[j];
						numberCopy[index] = number[j];
						korCopy[index] = kor[j];
						engCopy[index] = eng[j];
						mathCopy[index] = math[j];
						totalCopy[index] = total[j];
						avgCopy[index] = avg[j];
						index++;
					}
					name = nameCopy;
					number = numberCopy;
					kor = korCopy;
					eng = engCopy;
					math = mathCopy;
					total = totalCopy;
					avg = avgCopy;
				}
				else if (!flag)
				{
					System.out.println("학생 정보 삭제 완료");
					System.out.println("");
				}
			}
			else if (sel == 5) // 정보 추가
			{
				// System.out.println("정보추가");
				String[] nameCopy = new String[name.length + 1]; // 학생 이름 배열
				int[] numberCopy = new int[nameCopy.length]; // 학생 번호 배열
				int[] korCopy = new int[nameCopy.length]; // 국어 점수 배열
				int[] engCopy = new int[nameCopy.length]; // 수학 점수 배열
				int[] mathCopy = new int[nameCopy.length]; // 영어 점수 배열
				int[] totalCopy = new int[nameCopy.length]; // 총점 배열
				double[] avgCopy = new double[nameCopy.length]; // 평균 배열

				for (i = 0; i < name.length; i++)
				{
					nameCopy[i] = name[i];
					numberCopy[i] = number[i];
					korCopy[i] = kor[i];
					mathCopy[i] = math[i];
					engCopy[i] = eng[i];
					totalCopy[i] = total[i];
					avgCopy[i] = avg[i];
				}
				System.out.println("추가 학생 이름 입력");
				nameCopy[name.length] = sc.next();
				System.out.println("추가 학생 번호 입력");
				numberCopy[name.length] = sc.nextInt();
				System.out.println("추가 학생 국어 입력");
				korCopy[name.length] = sc.nextInt();
				System.out.println("추가 학생 영어 입력");
				engCopy[name.length] = sc.nextInt();
				System.out.println("추가 학생 수학 입력");
				mathCopy[name.length] = sc.nextInt();
				totalCopy[name.length] = korCopy[name.length] + engCopy[name.length] + mathCopy[name.length];
				avgCopy[name.length] = totalCopy[name.length] / 3.0;

				name = nameCopy;
				number = numberCopy;
				kor = korCopy;
				eng = engCopy;
				math = mathCopy;
				total = totalCopy;
				avg = avgCopy;
				System.out.println("학생 정보 추가 완료");
			}
			else if (sel == 6) // 프로그램 종료
			{
				break;
			}
			else
			{
				System.out.println("1 ~ 6 사이의 숫자 입력");
			}
		}
		System.out.println("프로그램 종료");
	}
}

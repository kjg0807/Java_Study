package com.naver.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// 1. 키보드 입력, 국어, 영어, 수학 점수 입력 총점과 평균 계산
		// 평균이 90점 이상이면 우등상 수상 모든 학생들은 졸업 출력

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===총점과 평균을 계산하는 프로그램===");

			int sum; // 총점
			double avg; // 평균

			System.out.println("국어점수를 입력하시오.");
			int kor = sc.nextInt(); // 국어
			System.out.println("수학점수를 입력하시오.");
			int math = sc.nextInt(); // 수학
			System.out.println("영어점수를 입력하시오.");
			int eng = sc.nextInt(); // 영어

			sum = kor + math + eng;
			avg = (double) sum / 3.0;

			System.out.println("총점은: " + sum + "점" + "평균은: " + Math.round(avg * 10.0) / 10.0 + "점입니다.");

			// 2. 평균 90이상 A 80이상 B 70이상 C 60이상 D 그 외는 F
			if (avg >= 90) {
				System.out.println("학점은 'A'입니다.");
				System.out.println("우등상을 수상하였습니다.");
			} else if (avg >= 80) { // if문만 사용할때 avg >= 80 && avg < 90
				System.out.println("학점은 'B'입니다.");
			} else if (avg >= 70) {
				System.out.println("학점은 'C'입니다.");
			} else if (avg >= 60) {
				System.out.println("학점은 'D'입니다.");
			} else {
				System.out.println("학점은 'F'입니다.");
			}
			System.out.println("졸업을 축하합니다.");
			System.out.println("종료하려면 !를 입력하시오.(실행하려면 아무 키나 입력)");

			String a = sc.next();
			if (a.equals("!")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}

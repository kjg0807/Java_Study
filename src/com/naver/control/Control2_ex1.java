package com.naver.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// if-else문 월급을 입력 1번 정규직 2번 계약직
		// 정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		// 계약직 - 3.3% - 실제 받을 급여 계산

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정규직이면 1 계약직이면 2를 입력");
			int job = sc.nextInt(); // 정규직 계약직 입력

			double rs; // 세금 계산 값
			double result;

			if (job == 1) { // 정규직
				System.out.println("(정규직)월급 입력(단위: 만원)");
				int mon = sc.nextInt(); // 월급입력
				rs = (double) mon * 0.036; // 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
				result = mon - rs; // 세후 최종 급여계산
				System.out.println(result + "만원"); // 최종 급여
			} else if (job == 2) { // 계약직
				System.out.println("(계약직)월급 입력");
				int mon = sc.nextInt(); // 월급입력
				System.out.println("계약직 급여계산");
				rs = (double) mon * 0.033; // 3.3%
				result = mon - rs; // 세후 최종 급여계산
				System.out.println(result + "만원"); // 최종 급여
			}

			System.out.println("!입력시 프로그램 종료(실행하려면 아무키나 입력)");
			String b = sc.next();
			if (b.equals("!")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}

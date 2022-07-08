package com.naver.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// nextInt(10): 0부터 입력한 10미만 범위에서 무작위 수를 고른다.
		// int num = random.nextInt(10);
		// int num1 = random.nextInt(10);
		// int num2 = random.nextInt(10);
		// System.out.println(num + " " + num1 + " " + num2);

		// random으로 가위바위보 3개중 1개 나오게 설정
		// 사용자가 하나 입력 - 컴퓨터가 하나 뽑아서 비교 - 사용자가 이길 경우만 비교
		// -> 내가 내는 것 설정
		// 0 - 가위, 1 - 바위, 2 - 보
		// 내가 이길때까지 계속 실행
		boolean ch = true;
		while (ch)
		{
			System.out.println("1. 가위, 2. 바위, 3. 보 (이길때까지 실행)");
			int num = random.nextInt(4);
			int th = sc.nextInt();
			if (th == 1)
			{
				System.out.println("가위");
			}
			else if (th == 2)
			{
				System.out.println("바위");
			}
			else if (th == 3)
			{
				System.out.println("보");
			}
			// -------------------------------------------------
			// 승패 지정
			System.out.println("사용자: " + th + " : " + "컴퓨터: " + num);
			if (th == 1 && num == 2) // 가위 바위
			{
				System.out.println("---졌습니다.---");
			}
			else if (th == 1 && num == 3) // 가위 보
			{
				System.out.println("---이겼습니다!---");
				break;
			}
			else if (th == 2 && num == 1) // 바위 가위
			{
				System.out.println("---이겼습니다!---");
				break;
			}
			else if (th == 2 && num == 3) // 바위 보
			{
				System.out.println("---졌습니다.---");
			}
			else if (th == 3 && num == 2) // 보 바위
			{
				System.out.println("---이겼습니다!---");
				break;
			}
			else if (th == 2 && num == 0) // 보 가위
			{
				System.out.println("---졌습니다.---");
			}
			else if (th == num)
			{
				System.out.println("---비겼습니다.---");
			}
		}
	}
}

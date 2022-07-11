package com.naver.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2
{

	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		// 몬스터 기본정보
		String[] monsterName = { "고블린", "오크", "트롤", "골렘" };
		int[] monsterHp = { 5, 10, 15, 20 };

		// 캐릭터 정보 - 마법사
		// System.out.println("캐릭터 이름 입력");
		// String name = sc.next();
		// 파이어 볼 - 공격력
		int magicPower = 6;

		// 몬스터 파티 생성 - 몬스터 수 입력, 입력 범위: 1 ~ 4 중 랜덤 2(입력한 수)마리 입력
		// HP 범위: 0.5 ~ 1 랜덤 생성

		int i; // 반복문
		System.out.println("생성할 몬스터 수 입력(1 ~ 4)");
		int monsterNum = sc.nextInt(); // 몬스터 수 입력
		String[] monsterPartyName = new String[monsterNum]; // 몬스터 이름 저장 배열
		int[] monsterPartyHP = new int[monsterNum]; // 몬스터 hp 저장배열

		for (i = 0; i < monsterNum; i++)
		{
			int index = random.nextInt(4); // 몬스터 이름을 4가지중 무작위로 뽑음
			monsterPartyName[i] = monsterName[index]; // 무작위로 뽑은 인덱스를 문자열에 대입
			monsterPartyHP[i] = monsterHp[index]; // 이름과 동일한 위치의 인덱스 사용을 위해 같은 변수 index 사용
		}
		for (i = 0; i < monsterNum; i++)
		{
			System.out.println(monsterPartyName[i] + " : " + monsterPartyHP[i]); // 무작위로 뽑은 이름과 같은 인덱스의 hp를 출력
		}
		// 파이어 볼(2 ~ 6사이 랜덤 데미지) 공격 - 1회
		boolean ch = true;
		int monsterdeath = 0;
		while (ch)
		{
			System.out.println("1. 사냥, 2. 도망");
			int sel = sc.nextInt();
			if (sel == 1)
			{
				for (i = 0; i < monsterNum; i++)
				{
					int count = random.nextInt(magicPower);
					// 남은 체력 = hp - 파이어 볼 데미지, 체력 - 데미지
					System.out.println(monsterPartyName[i] + "에게 " + count + "만큼 데미지");
					monsterPartyHP[i] = monsterPartyHP[i] - count;
					if (monsterPartyHP[i] < 1)
					{
						monsterdeath++;
					}
					System.out.println("남은 체력: " + monsterPartyHP[i]);
				}
			}
			else
			{
				break;
			}
			System.out.println("샤냥한 몬스터 수: " + monsterdeath);
		}
	}
}

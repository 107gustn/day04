package day04;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 * 마사지 샵입니다.
		 * 1. 마사기 받기
		 * 2. 나가기
		 * 3. 현재 방문 횟수 조회
		 * 최초 방문은 두피 마사지를 해드립니다.
		 * 최초 방문만 마사지에 대해 설명을 해주고 그 이후 방문은 설명을 해주지 않습니다.
		 * 방문횟수 5단위로 무료 발 마사지를 해드립니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num, count = 0;
		
		while(true) {
			System.out.println("어서오세요. 마사지샵 입니다.");
			System.out.println("1. 마사지 받기");
			System.out.println("2. 나가기");
			System.out.println("3. 현재 방문 횟수");
			System.out.print("무엇을 도와드릴까요? ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				if(count <= 0) {
					System.out.println("처음 오시는군요. 마사지는 어떻게 진행이 되며.....");
					System.out.println("최초 방문은 두피 마사지도 해드립니다.");
				}
				count++;
				if(count % 5 == 0){
					System.out.println("5회 단위로 방문하시면 서비스로 무료 발마사지를 해드립니다.");
				}
				System.out.println("마사지를 시작합니다.");
				System.out.println("....");
				System.out.println("수고하셨습니다.\n");
				break;
			case 2:
				System.out.println("안녕히 가세요.");
				break;
			case 3:
				System.out.println("현재 방문 횟수는 " + count + "회 입니다.");
				break;
			default:
				System.out.println("안녕히 가세요.");
			}
			System.out.println();
		}
		
		

	}

}

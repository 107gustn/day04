package day04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		while(true) //{} 안의 내용을 계속 반복을 시켜준다. //while(조건식=참,거짓) 
		{//조건이 참이면 실행시켜준다.
			System.out.println("실행");
			break;
		}
		*/
		
		
		
		
		
		//날짜를 입력받아 1일이면 '월', 2일이면 '화', ... 7일 '일', 8일 '월' 숫자에 맞춰 요일을 출력하시오.
		/*
		Scanner sc = new Scanner(System.in);
		int dNum;
		
		while(true) {
			System.out.print("날짜를 입력해 주세요 : ");
			dNum = sc.nextInt();
			
			switch(dNum % 7) {
			case 1:
				System.out.println("월");
				break;
			case 2:
				System.out.println("화");
				break;
			case 3:
				System.out.println("수");
				break;
			case 4:
				System.out.println("목");
				break;
			case 5:
				System.out.println("금");
				break;
			case 6:
				System.out.println("토");
				break;
			case 0:
				System.out.println("일");
				break;
			default:
				System.out.println("올바르지 않은 값입니다.");
			}
		}
		*/
		
		//변수 초기화
		//첫글자가 소문자로 시작하면 0으로 초기화한다.
		int num = 10, su = 0;//0값으로 변수를 초기화를 시켜준다
		char ch = 0;
		double dou = 0;
		
		//첫글자가 대문자로 시작하면 null로 초기화한다.
		String str = null; //String 문자열은 0으로 초기화 할 수 없다.
		
		if(num == 10) { //if문에 대한 값이 거짓이라면 실행되지않아서 값이 없으므로 오류가 생긴다.
			su = 100;
		}
		System.out.println( su );
		

	}

}

package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException { //throws IOException : 예외 처리
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		System.out.print("수 입력 : ");
		select = sc.nextInt();
		
		switch(select) { //입력된 값이 실행된다.
		case 1:
			System.out.println("1입력");
			break;//switch문을 빠져나감 //break가 없으면 다음문장이 실행된다.
		case 2:
			System.out.println("2입력");
			break;
		case 3:
			System.out.println("3입력");
			break;
		default: //= else //case와 매칭되는 값이 없으면 실행된다.
			System.out.println("그 외의값 입력");
		}
		System.out.println();
//		if(select == 1) {
//			
//		}else if(select == 2) {
//			
//		}
		
		
		char ch;
		System.out.print("문자 입력 : ");
		ch = (char)System.in.read(); //문자하나를 입력받는 기능
		switch(ch) {//소문자 a를 받던, 대문자 A를 받던 모두 대문자 A로 처리한다.
		case 'a':
			//System.out.println("a입력");
			//break;
		case 'A':
			System.out.println("A입력"); //다음 내용이 없는 마지막은 break문 생략이 가능하다.
		}
		System.out.println();
		
		
		String s;
		System.out.print("문자열 입력 : ");
		s = sc.next();
		switch(s) {
		case "안녕":
			System.out.println("안녕 입력");
			break;
		case "그래":
			System.out.println("그래 입력");
			break;
		}
		
		System.out.println("다음 문장들 실행");
	}

}

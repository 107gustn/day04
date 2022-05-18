package day04;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		/*
		 * 계산기를 통해 끊임없이 계속 계산을 해보세요.
		 * ex) 1 + 5 = 6   - 2 = 4   * 3 = 12   / 3 = 4   + 1 = 5...... 
		 */
		
		Scanner sc = new Scanner(System.in);
		int fNum, sNum, sum;
		String calc;
		
		System.out.print("숫자를 입력해주세요 : ");
		fNum = sc.nextInt();
		
		while(true) {
			System.out.print("기호를 입력해주세요 : ");
			calc = sc.next();
			
			System.out.print("숫자를 입력해주세요 : ");
			sNum = sc.nextInt();
			
			switch(calc) {
			case "+":
				sum = fNum + sNum;
				System.out.println(fNum + " + " + sNum + " = " + sum);
				fNum = sum;
				break;
			case "-":
				sum = fNum - sNum;
				System.out.println(fNum + " - " + sNum + " = " + sum);
				fNum = sum;
				break;
			case "*":
				sum = fNum * sNum;
				System.out.println(fNum + " * " + sNum + " = " + sum);
				fNum = sum;
				break;
			case "/":
				sum = fNum / sNum;
				System.out.println(fNum + " / " + sNum + " = " + sum);
				fNum = sum;
				break;
			default:
				System.out.println("다시 입력해주세여.");
			}
			System.out.println();
			
		}
		
	}

}

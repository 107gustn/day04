package day04;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		/*
		 * ���⸦ ���� ���Ӿ��� ��� ����� �غ�����.
		 * ex) 1 + 5 = 6   - 2 = 4   * 3 = 12   / 3 = 4   + 1 = 5...... 
		 */
		
		Scanner sc = new Scanner(System.in);
		int fNum, sNum, sum;
		String calc;
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		fNum = sc.nextInt();
		
		while(true) {
			System.out.print("��ȣ�� �Է����ּ��� : ");
			calc = sc.next();
			
			System.out.print("���ڸ� �Է����ּ��� : ");
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
				System.out.println("�ٽ� �Է����ּ���.");
			}
			System.out.println();
			
		}
		
	}

}

package day04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String home = null, office = null;
		int num;
		
		while(true) {
			
			System.out.println("1.�츮�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3.��� ����");
			System.out.print("��ȣ�� �Է��Ͻÿ� : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("�� �ּҸ� �Է��Ͻÿ� : ");
				home = sc.next();
				System.out.println();
				break;
			case 2:
				System.out.print("ȸ�� �ּҸ� �Է��Ͻÿ� : ");
				office = sc.next();
				System.out.println();
				break;
			case 3:
				if(home != null && office != null) {
					System.out.println("�츮�� : " + home);
					System.out.println("ȸ�� : " + office);
				}else {
					System.out.println("��ϸ��� �ϼ���.");
				}
				System.out.println();
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
	}
}

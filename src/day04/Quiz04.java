package day04;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 * ������ ���Դϴ�.
		 * 1. ����� �ޱ�
		 * 2. ������
		 * 3. ���� �湮 Ƚ�� ��ȸ
		 * ���� �湮�� ���� �������� �ص帳�ϴ�.
		 * ���� �湮�� �������� ���� ������ ���ְ� �� ���� �湮�� ������ ������ �ʽ��ϴ�.
		 * �湮Ƚ�� 5������ ���� �� �������� �ص帳�ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num, count = 0;
		
		while(true) {
			System.out.println("�������. �������� �Դϴ�.");
			System.out.println("1. ������ �ޱ�");
			System.out.println("2. ������");
			System.out.println("3. ���� �湮 Ƚ��");
			System.out.print("������ ���͵帱���? ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				if(count <= 0) {
					System.out.println("ó�� ���ô±���. �������� ��� ������ �Ǹ�.....");
					System.out.println("���� �湮�� ���� �������� �ص帳�ϴ�.");
				}
				count++;
				if(count % 5 == 0){
					System.out.println("5ȸ ������ �湮�Ͻø� ���񽺷� ���� �߸������� �ص帳�ϴ�.");
				}
				System.out.println("�������� �����մϴ�.");
				System.out.println("....");
				System.out.println("�����ϼ̽��ϴ�.\n");
				break;
			case 2:
				System.out.println("�ȳ��� ������.");
				break;
			case 3:
				System.out.println("���� �湮 Ƚ���� " + count + "ȸ �Դϴ�.");
				break;
			default:
				System.out.println("�ȳ��� ������.");
			}
			System.out.println();
		}
		
		

	}

}

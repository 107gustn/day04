package day04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		while(true) //{} ���� ������ ��� �ݺ��� �����ش�. //while(���ǽ�=��,����) 
		{//������ ���̸� ��������ش�.
			System.out.println("����");
			break;
		}
		*/
		
		
		
		
		
		//��¥�� �Է¹޾� 1���̸� '��', 2���̸� 'ȭ', ... 7�� '��', 8�� '��' ���ڿ� ���� ������ ����Ͻÿ�.
		/*
		Scanner sc = new Scanner(System.in);
		int dNum;
		
		while(true) {
			System.out.print("��¥�� �Է��� �ּ��� : ");
			dNum = sc.nextInt();
			
			switch(dNum % 7) {
			case 1:
				System.out.println("��");
				break;
			case 2:
				System.out.println("ȭ");
				break;
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("��");
				break;
			case 0:
				System.out.println("��");
				break;
			default:
				System.out.println("�ùٸ��� ���� ���Դϴ�.");
			}
		}
		*/
		
		//���� �ʱ�ȭ
		//ù���ڰ� �ҹ��ڷ� �����ϸ� 0���� �ʱ�ȭ�Ѵ�.
		int num = 10, su = 0;//0������ ������ �ʱ�ȭ�� �����ش�
		char ch = 0;
		double dou = 0;
		
		//ù���ڰ� �빮�ڷ� �����ϸ� null�� �ʱ�ȭ�Ѵ�.
		String str = null; //String ���ڿ��� 0���� �ʱ�ȭ �� �� ����.
		
		if(num == 10) { //if���� ���� ���� �����̶�� ��������ʾƼ� ���� �����Ƿ� ������ �����.
			su = 100;
		}
		System.out.println( su );
		

	}

}

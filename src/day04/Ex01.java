package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException { //throws IOException : ���� ó��
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		System.out.print("�� �Է� : ");
		select = sc.nextInt();
		
		switch(select) { //�Էµ� ���� ����ȴ�.
		case 1:
			System.out.println("1�Է�");
			break;//switch���� �������� //break�� ������ ���������� ����ȴ�.
		case 2:
			System.out.println("2�Է�");
			break;
		case 3:
			System.out.println("3�Է�");
			break;
		default: //= else //case�� ��Ī�Ǵ� ���� ������ ����ȴ�.
			System.out.println("�� ���ǰ� �Է�");
		}
		System.out.println();
//		if(select == 1) {
//			
//		}else if(select == 2) {
//			
//		}
		
		
		char ch;
		System.out.print("���� �Է� : ");
		ch = (char)System.in.read(); //�����ϳ��� �Է¹޴� ���
		switch(ch) {//�ҹ��� a�� �޴�, �빮�� A�� �޴� ��� �빮�� A�� ó���Ѵ�.
		case 'a':
			//System.out.println("a�Է�");
			//break;
		case 'A':
			System.out.println("A�Է�"); //���� ������ ���� �������� break�� ������ �����ϴ�.
		}
		System.out.println();
		
		
		String s;
		System.out.print("���ڿ� �Է� : ");
		s = sc.next();
		switch(s) {
		case "�ȳ�":
			System.out.println("�ȳ� �Է�");
			break;
		case "�׷�":
			System.out.println("�׷� �Է�");
			break;
		}
		
		System.out.println("���� ����� ����");
	}

}

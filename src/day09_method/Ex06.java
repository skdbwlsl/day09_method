package day09_method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06Method ex = new Ex06Method();
		ex.display();
		
		System.out.println("--- main ����---");
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.println(" �� �� �Է�");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum= ex.test(n1,n2);// �޼ҵ�ȣ���ϴ� ��
		ex.printSum(n1,n2,sum);
		//���⼱ ��·�� �޼ҵ�� �ٸ� ������ �ٷξ��� ���� 
		//�׷��� �ٷ� �����ʰ� ex.�̷��� ����
	}

}

package day09_method;

public class Ex05 {
	public static void main(String[] args) {
		Ex05Method ex = new Ex05Method();
		int s = ex.sumFunc(10, 20);
		System.out.println("�� �� : "+ s);
		
		ex.test(2);
		
		//��¹��1
		String ss = ex.test02();
		System.out.println(ss);
		
		//��¹��2 ���� 1,2��� �ȳ��ϼ���� ����
		System.out.println(ex.test02());
		
	}

}

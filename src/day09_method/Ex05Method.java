package day09_method;

public class Ex05Method {
	public int sumFunc(int num, int num2) {
		int sum = num+ num2;
		return sum;
		
	}
	
	public void test(int n) {
		//void�� return���� ���ٴ� �ǹ�
		if(n==1) {
			System.out.println("if");
			
		}else {
			System.out.println("else");
			return ; //�޼ҵ带 �����Ҷ��� ��ɵ� �ִ�
		}
		System.out.println("test�޼ҵ� ����");
		
	}
	/*
	//���ڿ� ���Ÿ� String���ֱ� �� ����Ÿ���� �� ���߱�
	public String test02() {
		return "�ȳ��ϼ���";
	

	}
*/
	/*
	public String test02() {
		int num=1;
		if(num==1)
			return "11.11";
		else
			return null;
		//�̶� return�� ���ٽ� �Ƚᵵ �Ŵµ�
	}
	*/


		public String test02() {
			int num=1;
			if(num==1)
				return "11.11";
			return null;
			//�ٽ� �ѹ� ����� �������ȳ� return
	}
	
}

package day09_method;

public class Ex05 {
	public static void main(String[] args) {
		Ex05Method ex = new Ex05Method();
		int s = ex.sumFunc(10, 20);
		System.out.println("두 합 : "+ s);
		
		ex.test(2);
		
		//출력방법1
		String ss = ex.test02();
		System.out.println(ss);
		
		//출력방법2 값은 1,2모두 안녕하세요로 같다
		System.out.println(ex.test02());
		
	}

}

package day09_method;

public class Ex05Method {
	public int sumFunc(int num, int num2) {
		int sum = num+ num2;
		return sum;
		
	}
	
	public void test(int n) {
		//void는 return값이 없다는 의미
		if(n==1) {
			System.out.println("if");
			
		}else {
			System.out.println("else");
			return ; //메소드를 종료할때의 기능도 있다
		}
		System.out.println("test메소드 종료");
		
	}
	/*
	//문자열 쓸거면 String써주기 즉 리턴타입은 꼭 맞추기
	public String test02() {
		return "안녕하세요";
	

	}
*/
	/*
	public String test02() {
		int num=1;
		if(num==1)
			return "11.11";
		else
			return null;
		//이땐 return을 ㄷ다시 안써도 돼는데
	}
	*/


		public String test02() {
			int num=1;
			if(num==1)
				return "11.11";
			return null;
			//다시 한번 써줘야 오류가안남 return
	}
	
}

package day09_method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06Method ex = new Ex06Method();
		ex.display();
		
		System.out.println("--- main 실행---");
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.println(" 두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum= ex.test(n1,n2);// 메소드호출하는 식
		ex.printSum(n1,n2,sum);
		//여기선 어쨌든 메소드랑 다른 범위라 바로쓰면 오류 
		//그래서 바로 쓰지않고 ex.이렇게 써줌
	}

}

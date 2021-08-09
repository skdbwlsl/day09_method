package day09_method;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07Method {
	public void reverse() {
		Scanner input = new Scanner(System.in);
		int su = 0,temp=0;
		System.out.println("¼ö ÀÔ·Â ");
		su = input.nextInt();
		while(true) {
		temp = su%10;
		su = su/10;
		System.out.println(temp+",");
		if(su==0) {
			break;
		}
	}
	}
	public ArrayList test() {
		ArrayList arr = null;
		return arr;

}
	public int[] test01() {
		int[] i = {1,2,3};
		return i;
}
}
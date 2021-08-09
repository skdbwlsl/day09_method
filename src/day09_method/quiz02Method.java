package day09_method;

import java.util.Scanner;

public class quiz02Method {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println(" ¼ö ÀÔ·Â");
	num =  input.nextInt();
	if(num%2==0) {
		System.out.println("Â¦¼ö");
	}else {
		System.out.println("È¦¼ö");
	}

}

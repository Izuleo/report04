package bracket;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Formula op = new Formula();
		String exp = "(3*5)-(6/2)";

		System.out.println(exp);
		
		if(op.testPair(exp)) 
			System.out.println("��ȣ ����!");
		  else
			System.out.println("��ȣ Ʋ��!");
		
	}
}

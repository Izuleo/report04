package Transformation;

public class Test {
	public static void main(String[] args) {
		Formula op = new Formula();
		String exp = "(2*5)-(7/1)";
		char postfix[];
		int value;
		System.out.println(exp);
		
		if(op.testPair(exp)){
			System.out.println("��ȣ�� ���� ��ġ�մϴ�.");
		}else{
			System.out.println("��ȣ�� ���� ����ġ�մϴ�.");
		}
		
		System.out.println("");
		System.out.println("[��ȯ ��]");
		op.toPostfix(exp);
	}
}

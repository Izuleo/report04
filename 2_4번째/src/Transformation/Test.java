package Transformation;

public class Test {
	public static void main(String[] args) {
		Formula op = new Formula();
		String exp = "(2*5)-(7/1)";
		char postfix[];
		int value;
		System.out.println(exp);
		
		if(op.testPair(exp)){
			System.out.println("괄호의 쌍이 일치합니다.");
		}else{
			System.out.println("괄호의 쌍이 불일치합니다.");
		}
		
		System.out.println("");
		System.out.println("[변환 후]");
		op.toPostfix(exp);
	}
}

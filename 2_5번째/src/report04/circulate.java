package report04;

import java.util.Scanner;
public class circulate {
	
	public circulate() {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		boolean check = true;

		for(int i=0; i<(int)input.length/2; i++) {
			if(input[i].equals(input[input.length-1-i]))
			{
			
			} else {
				check = false;
				break;
			}
		}
		System.out.println("legnth: "+input.length);
		System.out.println(check);
	}
	
	public static void main (String[] args) {
		new circulate();
	}
}

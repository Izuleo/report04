package reverse;

import java.util.Scanner;

public class reverse{ //문자열 역순 출력
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  
        
        String new_str = "";
 
        String[] str1 = str.split("");
        for (int i = str1.length-1; i > -1; i--) {
            new_str += str1[i];
        }
        System.out.println(new_str);
    }   
}
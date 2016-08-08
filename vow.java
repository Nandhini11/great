
package vowels;

import java.util.Scanner;


public class Vowels {

 
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        System.out.println("enter the char");
        Scanner v=new Scanner(System.in);
         ch=v.next().charAt(0);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
		
		System.out.println("Vowels : " );
                else
                            System.out.println("consonant");
                         
                }
  
    }


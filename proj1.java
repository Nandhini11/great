
package smapless;

import java.util.Scanner;
import sun.org.mozilla.javascript.internal.regexp.SubString;


public class logic1 {
    public static void main(String[] args){
        //System.out.println("enter the string");
        //Scanner sc=new Scanner(System.in);
        //String a=sc.nextLine();
        String a="welcometojava";
        int b=a.length();
        //System.out.println("enter the number");
         //Scanner in=new Scanner(System.in);
         //int n=in.nextInt();
        int n=3;
         int d=n;
        for(int i=0;i<b-2;i++){
           String c=a.substring(i, n);
           n++;
            System.out.println(""+c);
          } 
         String f=a.substring(0, d);
         String h=a.substring(b-3,b);
        System.out.println(""+h);
        System.out.println(""+f);
       
    }
    
}

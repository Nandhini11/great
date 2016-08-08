
package smapless;

import java.util.Scanner;
public class activity5 {
    public static void main(String[]args){
        System.out.println("enter the two no");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operation to be performed");
        Scanner sc1=new Scanner(System.in);
        String c=sc1.nextLine();
        String d="+",e="-",f="*", g="/";
        if(c.equals(d)){
            int add=a+b;
            System.out.println("addition of two no is  "+add);
        }else if(c.equals(e)){
            int sub=a-b;
            System.out.println("sum is "+sub);
            
        }else if(c.equals(f)){
            int mul=a*b;
             int div1=a/b+1;
             Sstem.out.pritnln("div1 is" +div1);
            System.out.println("mul is  "+mul);
            
        }else if(c.equals(g)){
            int div=a/b;
            System.out.println("div is"+div);
          }
    }
    
}


package numbers;

import java.util.Scanner;
public class power123 {

    public static void main(String[] args){
        int a,b=0,c = 0,c1=0,d = 0;
        System.out.println("enter the no ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=n;
        while(n>0){
            a=n%10;
            b=b+1;
            n=n/10;
          }
        System.out.println("there is  "+b +"  digits");
         while(n1!=0){
            int a11=n1%10;
            int a1=1;
            for(int i=1;i<=b;i++){
               a1=a1*a11;
                }
             c1=c1+a1;
             b--;
             n1=n1/10;
             
         }
             System.out.println("power is"+c1);
          
       }
    
    }




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smapless;

import java.util.Scanner;

/**
 *
 * @author Nandhini
 */
public class activity13 {
    public static void main(String[] args){
       int amt=1210,s,a1,ba;
        int[] a=new int[5];
       int[] b=new int[5];
       int[] c=new int[5];
        System.out.println("enter the present ratio");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            a[i]=sc.nextInt();
          }
         System.out.println("enter the  ratio");
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<2;i++){
            b[i]=sc1.nextInt();
             }
        for(int i=0;i<2;i++){
            c[i]=a[i]/b[i];
         }
         s=c[0]+c[1];
       a1=amt/s;
       ba=2*a1;
       System.out.println("a amount is"+a1);
        System.out.println("b amount is"+ba); 
        System.out.println("total is"+(a1+ba));
    }
           
}

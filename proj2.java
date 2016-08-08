package numbers;

import java.util.Scanner;


public class Numbers {

   
    public static void main(String[] args) {
        // TODO code application logic here
         
        int sum=0,i;
        int[] a=new int[4];
        System.out.println("enter the values");
        for(i=0;i<3;i++){
            Scanner in=new Scanner(System.in);
            a[i]=in.nextInt();
        }
        for(i=0;i<3;i++){
            if(a[i]==13){
                System.out.println("13th no came in anarray");
               break;
            }else
            {
                sum=sum+a[i];}}
                System.out.println("sum of arrray is"+sum);
           }
    }


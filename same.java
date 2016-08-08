
package smapless;

import java.util.Scanner;


public class lettersame {
    public static void main(String[] args){
        int b, max=0,count=1;
                System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        b=a.length();
        for(int i=0;i<b-1;i++){
           if(a.charAt(i)==a.charAt(i+1)){
               count++;
               max=count;
                
              }
              else if(b==0){
                  continue;
              }}
        System.out.println("count is "+max);    
}
    } 


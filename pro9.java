/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fripro;

import java.util.Scanner;

/**
 *
 * @author Nandhini
 */
public class Fripro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,count=0;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        a=s.length();
        for(int i=0;i<a-2;i++){
            if((s.charAt(i)==s.charAt(i+1))&&(s.charAt(i)==s.charAt(i+2))){
                count++;
            }else{
                continue;
            }
        }
        System.out.println("countis "+count);
    }
}

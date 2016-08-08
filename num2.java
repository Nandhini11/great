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
public class consestr {
    public static void main(String[] args){
        System.out.println("enter the two string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int a=s1.length();
        int b=s2.length();
        if(a==b){
        for(int i=0;i<a-1;i++){
        if(s1.substring(i, i+1).equals(s2.substring(b-2,b-1))){
            System.out.println("true as "+s1.charAt(i)+s1.charAt(i+1)+"is a part of string ‘a’ which is a sub-string in string ‘b’  ");
          }
        }
      }
    }
  }
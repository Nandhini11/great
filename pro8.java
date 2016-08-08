/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smapless;

/**
 *
 * @author Nandhini
 */
public class activity4 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<500;i++){
            for(int j=1;j<500;j++){
                int N=i*j;
                  if(N==9375){
                     if(i>j){
                        int x=i/j;
                           while(x==15){
                            
                        }
                     } else{
                        int x=j/i;
                        sum=i+j;
                        }
                  }
            }
        } System.out.println("the sum is"+sum);
    }
}                         


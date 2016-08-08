/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fripro;

/**
 *
 * @author Nandhini
 */
public class matrixex {
    public static void main(String[] args){
      int i,j;
      int a[][]={{3,4,5},{3,2,7}};
      int b[][]={{2,4,7},{1,2,2}};
      int l= a.length;
        System.out.println("first matrix is ");
        for( i=0;i<l;i++){
            for( j=0;j<i;j++){
            System.out.println(""+a[i][j]); }
        }
           System.out.println();
    
           int m=b.length;
           System.out.println("second matrix is"+"");
           for(i=0;i<m;i++){ 
               for(j=0;j<3;j++){
                   System.out.println(""+b[i][j]);
            }
               System.out.println();
  }
        System.out.println("summation of two matreix is:");
        for( i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.println(""+a[i][j]+b[i][j]);
            } System.out.println();
        }
    }}


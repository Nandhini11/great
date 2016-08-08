package numbers;

public class passwordcreat {
   public static void main(String[] args){
       String in1="Rajiv";
       String in2="Roy";
       int in3=560037;
       int in4=6,i=0;
       int[] q=new int[10];
       int a=in1.length();
       int b=in2.length();
       if(b<a){
       char c1=in1.charAt(0);
       String s1=c1+in1;
           System.out.println(""+s1);
           while(in3!=0){
               int n=in3%10;
               int n1=n;
               in3=in3/10;
               q[i]=n1;
               System.out.println(""+q[i]);
               i++;
               }
       }
         else if(b==a){
           char c2=in1.charAt(0);
           int m=c2;
           System.out.println(""+m);
           char c3=in2.charAt(0);
           int k=c3;
           System.out.println(""+k);
           if(m>k){
               String s2=c3+in1;
               System.out.println(""+s2);
                }
           else{
               String s2=c3+in1;
               System.out.println(""+s2);
           }
       
                 
           }
       }
   }


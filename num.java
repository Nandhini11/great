
package overriding;

 class Overriding {
    void smile(){
        System.out.println("nandhini");
        
    }
     public static void main(String[] args) {
        // TODO code application logic here
       Overriding o=new Overriding();
       o.smile();
  
        java J=new java();
        J.smile();
        
    }
}
class java extends Overriding{
    @Override
    void smile(){
        System.out.println("deepika");
    }

   
}

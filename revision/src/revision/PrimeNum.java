package revision;

public class PrimeNum {



    public static void main(String[] args) {
     
     boolean prime=true;
     int count=0;
     
     for(int i=2;i<=100; i++ ){
         prime=true;
           for(int j=2;j<i; j++ ){
               if(i%j==0){
               
               prime=false;
               }  
           
           }
       if(prime){
           System.out.print(i+" ");
           count++;
       }   
     }
          System.out.print("the count the prime number:"+count); 
     }
        
    }
        



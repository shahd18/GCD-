
package gcd;
import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner word= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = word.nextInt();
        System.out.print("Enter second number: ");
        int b = word.nextInt();
        
        long start = System.currentTimeMillis();
        System.out.println("The GCD = "+ gcd(a,b));
        System.out.println("The GCD of Euclid = "+ Euclid(a,b));
 
        long elapsedTimeMillis = System.currentTimeMillis()-start;
         System.out.println("Time = "+ elapsedTimeMillis);
    }
    
    
    //Finding greatest common divisor (GCD)
    public static int gcd(int m, int n){
        int array[];
        int min;
        if(m>=n)
            min = n;
        else 
            min = m;
        
        array = new int[min];       
        int j = 0;
        for(int i=1; i <= min; i++){         
           if(m%i == 0 && n%i ==0  ){
               array[j] = i;
               j++;
           }      
        }
        return array[j-1];  
    }
    
    //Euclid’s algorithm to find GCD
    public static int Euclid(int m, int n){
        while(n!=0){
            int r = m%n;
            m=n;
            n=r;
        }
        return m;
    }
}
        
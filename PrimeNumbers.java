import java.util.*;
public class PrimeNumbers {
    public static int checkPrime(int a){
        int c= 0;
        if(a==0||a==1){
            System.out.println("Not a prime number");
        }
        else{
            for(int i=2; i<a;i++){
            
              if(a%i==0){
                c=1;
            }}

            if(c==1){
                System.out.println("The number is not  prime");
            }
            else{
                System.out.println(a+" is  a prime number");
            }
        }
        
        
    
return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       checkPrime(a);

    }
    
}

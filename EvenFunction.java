import java.util.*;
public class EvenFunction {
    public static void checkEven(int a){
        if(a%2==0){
            System.out.println("The number is even");

        }else {
            System.out.println("The number is not even");
        }
       
    } 
    public static void main(String args[]){
Scanner sc =  new Scanner(System.in);
int a = sc.nextInt();
checkEven(a);


    }
    
}

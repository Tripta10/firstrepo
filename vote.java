import java.util.*;
public class vote {
    public static void vote(int age){
        
        if(age>=18){
            System.out.println("You are eligible to vote ");
        }else{

            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String args[]){
        System.out.print("Enter your age ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age);

        
    }
    
}

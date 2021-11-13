import java.util.*;
public class Hem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time: ");
        double time = sc.nextDouble();
        double SI = (principal*rate*time)/100;
        System.out.println("The simple interest is "+SI);


    }
    
}

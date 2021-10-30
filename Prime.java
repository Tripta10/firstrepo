import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int a=2; a<n; a++){
            if(n%a==0){
                System.out.println("not prime");

            }
            else{
                System.out.println("prime");
            }
        }
    }
       
}

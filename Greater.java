import java.util.*;
public class Greater {
    public static int greater(int a, int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        return 0;
    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   greater(a,b);

   }
   
}

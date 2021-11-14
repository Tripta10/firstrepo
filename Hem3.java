import java.util.*;
public class Hem3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of array: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int sum = 0;
        int arr[] = new int[size];
        
        
        for(int i = 0; i<size;i++){
        arr[i]= sc.nextInt();

        }
        for( int i = 0; i< 3; i++){
           
            sum = sum + (arr[i])^i;
            
            
        }
        System.out.println("The result is "+sum);
    }
    
}

import java.util.*;
public class Array13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter the numbers of columns: ");
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];
System.out.println("Enter the elements of the array");
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search");
        int x = sc.nextInt();
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("The number is found at "+i+" "+j+" ");

                }

            }
        }
    }
    
}

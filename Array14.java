import java.util.*;
public class Array14 {
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
        for(int i = 0;i<cols;i++){
            for(int j = 0;j<rows;j++){
                System.out.print(numbers[j][i]+" ");
            }
            System.out.println();
        }
    }
}

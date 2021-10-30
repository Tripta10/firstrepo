import java.util.*;
public class Table {
    public static int table(int n){
        for( int i=0;i<=10;i++){
            System.out.println(n*i);
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
}

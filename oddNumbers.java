import java.util.*;
public class oddNumbers {
    public static void oddNum(int n){
        for (int i=0;i<=n;i++){
            if(i%2==0){

        }else{
            System.out.println(i);
        }
    }}
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        oddNum(n);
    }
}

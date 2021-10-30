import java.util.*;
public class areaCircle {
    public static int areaCirclee(double r){
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println("The area of the circle is "+area);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        areaCirclee(r);
    }
    
}

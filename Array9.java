public class Array9 {
    public static void main(String[] args){
        int arr[]= {1,4,5,7};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }

        } 
        System.out.println("minimum number "+min);
        System.out.println("Maximum number "+max);
    }
    
}

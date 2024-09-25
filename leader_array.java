import java.util.*;
//import java.util.lang.*;

public class leader_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        findLeaders(arr,n);
    }
    public static void findLeaders(int arr[],int size) {
        int rightMaximum = arr[arr.length - 1];
        System.out.println("rightMaximum"+" ");
        for(int i = size-2; i >= 0; i--){
            if(arr[i] > rightMaximum) {
                rightMaximum = arr[i];
                System.out.println(rightMaximum+" ");
            }
        }
    }
}

import java.util.*;

public class sliding_window{
    public static void main(String[] args){
        int k = 3;
        int[] arr1 = {5,2,-1,0,3};
        int i = 0;
        int j = k - 1;
        int max_sum = 0;
        for(int m = i;m <= j; m++){
            max_sum +=arr1[m];
        }


    }
}
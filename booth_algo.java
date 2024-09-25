import java.util.*;
public class booth_algo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int multiplicand = scan.nextInt();
        int multiplier = scan.nextInt();

        int product = 0;
        int multiplicandBits = Integer.toBinaryString(multiplicand).length();

        for(int i = 0;i<multiplicandBits;i++){
            int currentBit = (multiplicand &0b1);
            if(currentBit == 1){
                product += multiplier;
            }
            multiplier<<=1; //Signed Left Shift "<<"
            multiplicand>>>=1; //Unsigned Right Shift ">>>"

        }
        System.out.println(product);
        scan.close();   
    }
}
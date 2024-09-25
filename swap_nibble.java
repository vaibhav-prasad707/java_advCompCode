import java.util.*;
public class swap_nibble {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int num = scan.nextInt();
        int swapnum;
        swapnum = ((num & 0x0F) << 4|(num & 0xF0) >>4);       
        System.out.println("Before swapping the nibble: "+num);
        System.out.println("\nAfter swapping the nibble: "+swapnum);
        scan.close();
    }
}

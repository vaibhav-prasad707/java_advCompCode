public class bin_palin {
    static String bin(int n){
        String ans = "";
        while(n>0){
            ans = (Integer.toString(n&1)) + ans;
            n>>=1;
        }
        return ans;
    }
    static int checkPalindrome(int n){
        String s1 = bin(n);
        StringBuilder s2 = new StringBuilder(s1); //It will not create any object. To reduce the complexity of the code
        s2 = s2.reverse();
        return s1.equals(s2.toString())?1:0;
    }
    public static void main(String[] args){
        int x = 9;
        System.out.println(checkPalindrome(x));
        x = 10;
        System.out.println(checkPalindrome(x));
        x = 73;
        System.out.println(checkPalindrome(x));
        
    }
}

public class PalindromeNumber {
    static void palindrome(int num){
       int rev = 0;
       int temp = num;
       while(num > 0) {
           rev *= 10;
           rev += num % 10;
           num /= 10;
       }
       if (rev == temp) {
           System.out.println("The number is palindrome");
       } else
           System.out.println("The number isn't palindrome");

    }

    public static void main(String[] args) {
        int num = 1123211;
        palindrome(num);
    }
}

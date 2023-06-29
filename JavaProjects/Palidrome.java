public class Palidrome {

    public static void convertNumber(int num) {
        int count = 0;
        int rev = 0;
        int temp = num;

    while(num >  0){
        rev *= 10;
        rev += num % 10;
        num = num / 10; 
        count++;
    }
    System.out.println("Number = " + temp + " its reverse = " + rev);
    System.out.println("Number of digits: " + count);
    if(rev == temp){
        System.out.println("The number is palindrome");
        }else
            System.out.println("The number is not palindrome");
    }

    void fabonacci( int numbers){
        int num1 = 0;
        int num2 = 1;
        int num3;
        for(int i = 0; i < numbers; i++){
            System.out.print(num1);
            System.out.print(" ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args) {
        convertNumber(536871066);
        System.out.println("********************************");
        new Palidrome().fabonacci(8);
    }
        
}

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FactorialOfNumber {
    static long factorize(int num) {
        if (num == 1) {
            return num;
        }
        if (num == 0){
            return 0;
        } else if(num < 0) {
            System.out.println("You've entered a negative number");
            System.out.println("Convert to positive number?\nEnter y or Y");
            Scanner ip = new Scanner(System.in);
            char conf = ip.next().charAt(0);
            if(conf == 'y' || conf == 'Y'){
                num = Math.abs(num);
            }else {
                System.out.println("Bye!");
                return num;
            }
        }
        return num * factorize(num -1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any integer to compute its factorial");
        int num = Integer.parseInt(br.readLine());
        long result = factorize(num);
        System.out.println( num + "! = " + result);
    }
}

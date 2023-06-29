import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    void take_array(String name, int age){
//        int[] arr = new int[] {45, 56, 8, 23};
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + age);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String[] arr = new String[4];
        Array1 obj = new Array1();
        System.out.println("Enter a name");
        for(int i = 1; i <= arr.length; i++) {
            arr[i] = ip.nextLine();
        }
        obj.take_array(Arrays.toString(arr), 34);

    }
}

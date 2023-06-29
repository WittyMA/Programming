package array.object.call.valueVsReference;

import java.util.Arrays;

public class CallByReference{
    void reference(int[] grade) {
        grade[0] = 0; grade[1] = 0; grade[2] = 0; grade[3] = 0;
        for(int i : grade){
            System.out.print(grade[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 90, -5, 4, 0, 74};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        new CallByReference().reference(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}

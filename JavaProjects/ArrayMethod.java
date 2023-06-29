import java.util.Arrays;

public class ArrayMethod {
    void printArray(int[] arr) {
        for (int a:arr ) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
        for (int a = 0; a < arr.length; a++ ) {
            for (int b = a + 1; b < arr.length; b++){
                if (arr[a] > arr[b]){
                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
            }
            System.out.print(arr[a]);
            System.out.print(" ");
        }
    }
    int[]  returnArray() {
        int[] arr = new int[] {34, 56, 67, 8, -65, 0, 44};
        Arrays.sort(arr);
        return arr;
    }
    int[]  returnArray(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {23, 4, 67, 90, 0, -56, 7};
        new ArrayMethod().printArray(arr);
        System.out.println();
        System.out.println(Arrays.toString(new ArrayMethod().returnArray(arr)));
        System.out.println("Null parameters");
        System.out.println(Arrays.toString(new ArrayMethod().returnArray()));
    }
}

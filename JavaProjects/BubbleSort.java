public class BubbleSort {
    void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]){
                    temp = arr[i];
                     arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, -45, 89, 1, -2, 17, 0, 36};
        BubbleSort obj = new BubbleSort();
        obj.sort(arr);

    }
}

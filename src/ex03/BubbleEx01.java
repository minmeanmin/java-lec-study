package ex03;

public class BubbleEx01 {
    static void bubble(int[] arr){
        final int N = arr.length;

        int temp;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0;  j < N-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        BubbleEx01.bubble(arr);
        System.out.println("");

        int[] arr2 = {5, 8, 2, 4, 3, 10, 500, 7, 6};
        BubbleEx01.bubble(arr2);
    }
}

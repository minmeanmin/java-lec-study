package ex03.test;

public class BubbleTest06 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

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

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

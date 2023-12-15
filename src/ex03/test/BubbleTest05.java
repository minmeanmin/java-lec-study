package ex03.test;

public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;
        for (int loop = 0; loop < N-1; loop++) {
            if(arr[loop] > arr[loop+1]){
                temp = arr[loop];
                arr[loop] = arr[loop+1];
                arr[loop+1] = temp;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

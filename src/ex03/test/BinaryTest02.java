package ex03.test;

public class BinaryTest02 {


    public static void main(String[] args) {
        //이진 검색 - > 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9/2 = 4하고 4번지를 찾아서 감(정 중앙으로) 찾으려는 값이 중앙의 5보다 크면 6, 7, 8, 9중에서 찾는다. 4/2 = 2하고 ... 계속 찾음

        int N = arr.length;

        final int target = 8;
        int start = 0;
        int end = N-1;
        int mid = (end - start) / 2;

        while(true){

            if(arr[mid] == target){
                System.out.println(target + "값은 " + mid + "번지에 있습니다.");
                break;
            }

            if(arr[mid] < target) {
                start = mid + 1;
                mid = (end + start) /2;
            }

            if(arr[mid] > target){
                end = mid - 1;
                mid = (end - start) /2;
            }
            System.out.println(start);
            System.out.println(end);
        }


    }
}

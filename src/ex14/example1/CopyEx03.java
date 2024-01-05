package ex14.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEx03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> list2 = new ArrayList<>();

        for(Integer i : list){
            if(i<3){
                list2.add(i);
            }
        }//아래와 같은 코드
//        List<Integer> newList = list.stream().filter(i ->  i<3).toList();
//
//        newList.stream().forEach(i -> System.out.println(i));
    }
}

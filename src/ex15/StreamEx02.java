package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        char[] ch = new char[4]; //보조 스트림

        try {
            ir.read(ch); // 키보드에 연결된 객체를 보조스트림 ch로 읽는다.

            for(char c : ch){
                System.out.print(c+" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

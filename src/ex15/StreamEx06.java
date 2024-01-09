package ex15;

import java.io.*;

// 상대 경로 : 실행되는 위치를(프로젝트 폴더) 기반으로 경로 정하는 것
// 절대 경로 : 루트에서부터 경로를 찾는 것 (상관없음)
// 윈도우 : C:\workspace\hello.txt -> \\
// 맥, 리눅스 : /workspace/hello.txt

// 복사 프로그램
public class StreamEx06{
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try{
            inputStream = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt")); // 절대경로
            //inputStream = new BufferedReader(new FileReader("src\\ex15\\hello.txt")); // 상대경로
            outputStream = new PrintWriter(new FileWriter("D:\\workspace\\java_lec\\study\\src\\ex15\\output.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();  //inputStream close
            }
            if (outputStream != null) {
                outputStream.close(); //outputStream close
            }
        }

    }
}
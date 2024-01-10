package ex17.halfway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 20000);

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            pw.println("3"); //requestMsg

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String responseMsg = br.readLine();
            System.out.println("서버로부터 받은 메시지 : " + responseMsg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

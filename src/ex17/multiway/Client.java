package ex17.multiway;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class Client {
    private static Socket socket;
    public static synchronized void sub1(){
        try {
            //버퍼 만들기 - 받기만 하는 코드
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                String msg = br.readLine();

                if (msg == null) break;

                System.out.println(msg);
            }
        } catch (SocketException e) {
            if ("Connection reset".equals(e.getMessage())) {
                System.out.println();
                System.out.println("Server가 퇴장하셨습니다.");
            } else {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sub2(){
        try {
            //버퍼 만들기 - 받기만 하는 코드
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String msg = br.readLine();

                if (msg == null) break;

                pw.println("Client : "+msg);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //main thread
    public static void main(String[] args) {
        try {
            socket = new Socket("localhost",30000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Thread t1 = new Thread(() -> {
            sub1();
        });

        Thread t2 = new Thread(() -> {
            sub2();
        });

        t1.start();
        t2.start();
    }
}
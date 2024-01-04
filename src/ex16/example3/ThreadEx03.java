package ex16.example3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadEx03 extends JFrame {
    private boolean state = true;
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel countLabel2;

    public ThreadEx03() {
        setTitle("숫자 카운터 프로그램");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을 때 메인도 같이 종료되게 하기

        // 레이아웃 매니저 설정
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

//        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("숫자1 : " + count);
        countLabel2 = new JLabel("숫자2 : " + count2);
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        countLabel2.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);
        add(countLabel2);

        // 멈춤 버튼 생성
        JButton increaseButton = new JButton("멈춤");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);

        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(e -> {
            state = false;
        });

        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000);
                    count++;
                    countLabel.setText("숫자 1 : " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();
        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000);
                    count2++;
                    countLabel2.setText("숫자 2 : " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();


//        setVisible(true);


    }

    public static void main(String[] args) {
        new ThreadEx03();
    }
}
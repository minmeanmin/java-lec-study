package ex14.example1;

import java.time.LocalDateTime;

//Data Transfer Object
class JoinDTO{
    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public JoinDTO(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

class Member{
    private int no;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; //회원가입 된 시간

    public Member(int no, String username, String password, String email, LocalDateTime createdAt) {
        this.no = no;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }//하나씩 다 받아서 처리

    public Member(int no, JoinDTO dto, LocalDateTime createdAt) {
        this.no = no;
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createdAt = createdAt;
    }//dto를 받아서 처리

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");
        JoinDTO d3 = new JoinDTO("min", "5678", "min@nate.com");

        int no = 1;
        //하나씩 다 받아서 처리
        Member m1 = new Member(no++, d1.getUsername(), d1.getPassword(), d1.getEmail(), LocalDateTime.now());
        System.out.println(m1);
        Member m2 = new Member(no++, d2.getUsername(), d2.getPassword(), d2.getEmail(), LocalDateTime.now());
        System.out.println(m2);

        //dto를 받아서 처리
        Member m3 = new Member(no++, d3, LocalDateTime.now());
        System.out.println(m3);

    }
}

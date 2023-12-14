package ex02.Programming;

public class P04 {
    public static void main(String[] args) {

        System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t", "P","Q","AND","OR","XOR");
        System.out.println("");
        boolean P, Q, AND, OR, XOR;
        P = true;
        Q = true;
        AND = P && Q;
        OR = P || Q;
        XOR = !P || !Q;
        System.out.printf("%-5b\t%-5b\t%-5b\t%-5b\t%-5b\t", P, Q, AND, OR, XOR);
        System.out.println("");
        P = true;
        Q = false;
        AND = P && Q;
        OR = P || Q;
        XOR = !P || !Q;
        System.out.printf("%-5b\t%-5b\t%-5b\t%-5b\t%-5b\t", P, Q, AND, OR, XOR);
        System.out.println("");
        P = false;
        Q = true;
        AND = P && Q;
        OR = P || Q;
        XOR = !P || !Q;
        System.out.printf("%-5b\t%-5b\t%-5b\t%-5b\t%-5b\t", P, Q, AND, OR, XOR);
        System.out.println("");
        P = false;
        Q = false;
        AND = P && Q;
        OR = P || Q;
        XOR = !P || !Q;
        System.out.printf("%-5b\t%-5b\t%-5b\t%-5b\t%-5b\t", P, Q, AND, OR, XOR);

    }
}

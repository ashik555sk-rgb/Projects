import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("ENTER YOUR FIRST NUMBER A ");
            int a = input.nextInt();

            System.out.println("ENTER YOUR SECOND NUMBER B5 ");

            int b = input.nextInt();
            a = a - b;
            b = a + b;
            a = b - a;

            System.out.println("SWAP NUMBER A=" + a);
            System.out.println("SWAP NUMBER B =" + b);
        }
    }
}
import java.util.*;

public class que_methods {
    static Scanner sc = new Scanner(System.in);

    // 1 print tablenusing method
    static void table(int n) {
        for (int i = 0; i <= 10; i++) {
            int tab = n * i;
            System.out.printf("%d x %d = %d\n", n, i, tab);
        }
    }

    // // 2 pattern
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // // 3write recursive function claculate sum of first n natural number
    static int sumrec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumrec(n - 1);
        }
    }
// 4 fibonacci series;
static int  fib(int n){
    
     if (n == 1) {
        return 0;
    } else if (n == 2) {
        return 1;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}
    public static void main(String[] args) {
        System.out.print("enter your number: ");
        int n = sc.nextInt();
       // table(n);
        //pattern(n);
       // int c = sumrec(n);
        //System.out.println(c);
       // int a = fib(7);
        //System.out.print("fibonnaci series is :" + a);
    }
}
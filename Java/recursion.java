public class recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Ititrative method
    static int fac(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= a; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fac(6));
    }

}

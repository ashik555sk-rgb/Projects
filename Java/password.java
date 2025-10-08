import java.util.Scanner;

public class password {
   public password() {
   }

   public static void main(String[] var0) {
      int var2 = 1;
      try (Scanner var1 = new Scanner(System.in)) {
         System.out.println("ENTER YOUR PASSWORD");
         int var4 = var1.nextInt();
         if (var4 == var2) {
            System.out.println("PHONE IS UNLOCKED");
         } else {
            System.err.println("WRONG PASSWORD PLEASE TRY AGAIN");
         }

      }
   }
}
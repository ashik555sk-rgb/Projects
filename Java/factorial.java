import java.util.Scanner;

public class factorial {
   public factorial() {
   }

   public static void main(String[] var0) {
      try (Scanner var1 = new Scanner(System.in)) {
         System.out.println("ENTER YOUR NUMBER");
         int var2 = var1.nextInt();
         long var3 = 1L;

         for(int var5 = 1; var5 <= var2; ++var5) {
            var3 *= (long)var5;
         }

         System.out.println("FACTORIAL IS " + var3);
      }
   }
}
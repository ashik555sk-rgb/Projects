import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        //question one print pattern
        // int n = 4;
        // for(int i=n; i>0; i--){
        //     for (int j=0; j<i; j++){
        //         System.out.print(" $");
        //     }
        //     System.out.print("\n");
        // }
// add first n even numbers;
 Scanner input = new Scanner(System.in);
// //System.out.println("ENTER YOUR NUMBER");
// int n =  2;//input.nextInt();
// int sum = 0;
// for( int i = 0; i<n; i++){
//     sum = sum + (2*i);
//     // System.out.println( "SUM OF FIRST N NUMBER IS: ");
//     System.out.println(sum);
// }
//  System.out.print("ENTER YOUR NUMBER: ");
// int n = input.nextInt();
// for (int i = 1; i<=10; i++){
//     System.out.printf("%d x %d = %d\n", n ,i,n*i);
    
// }
// System.out.print("ENTER YOUR NUMBER: ");
// int n = input.nextInt();
// for (int i = 10; i>=1; i--){
//     System.out.printf("%d x %d = %d\n", n ,i,n*i);
    
// }
// factorial of anumber
System.out.print("ENTER YOUR NUMBER: ");
int n = input.nextInt();
int i = 1;
int factorial = 1;
while(i<=n){
    factorial *= i;
    i++;
   
    System.out.println(factorial);
}
input.close();
}
    }


import java.util.Scanner;
class egg {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.println("ENTER YOUR NUMBER");
 int num = input.nextInt();
 int gross= num/144;
 int num1= gross*144;

 num=num-num1;
 int drzon= num /12;
 int num2 = drzon*12;
 num=num-num2;

 System.out.println(gross + " GROSS" +" ," + drzon + " DRZON" +" ," + num + "EGGS ");
 input.close();
 }
}
import java.util.Scanner;
public class table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print( "ENTER YOUR NUMBER:  ");
        int a = input.nextInt();
        System.out.println("THE TABLE OF: " + a+"IS");
        for(int i = 1; i<=10; i++){
            
            System.out.println(a*i);
        }
        input.close();
    }
}

import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE: ");
        int age = input.nextInt();
        boolean result = age>=18&&age<=60;
        if(result){
            System.out.println("YOU ARE ELEGIBLE FOR Driving);");

        }
        else{
            System.out.println("YOUR ARE NOT ELEGIBLE FOR Driving");
        }
input.close();
    }
}

import java.util.Scanner;
public class switchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 5");
        int num = sc.nextInt();
        switch(num){
            case 1:
            System.out.println("You Entered One");
            break;
            case 2:
            System.out.println("You Entered Two");              
            break;
            case 3:
            System.out.println("You Entered Three");
            break;
            case 4:
            System.out.println("You Entered Four");
            break;
            case 5:
            System.out.println("You Entered Five");
            break;
            default:
            System.out.println("You Entered a number greater than 5");
            break;  
        }
        
        sc.close();

    }    
}

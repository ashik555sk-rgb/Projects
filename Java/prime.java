import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
          int a = input.nextInt();
          int count = 0;
          for (int i= 1; i<=a; i++){
          
          if(a%2==0){ 
            count=count+1;
            
          }
        }
if( count==2){
    System.out.println("NUMBER IS PRIME");

}
else{
    System.out.println("NOT PRIME");
}
    }
    
} 
    


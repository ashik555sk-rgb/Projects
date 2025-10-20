import java. util.*;
public class methods {
    static int cal(int x,int y){
        int z;
        if (x>y){
           z = x + y;
        
        }
        else if(x==y){
            z= x/y;

        }
        else {
            z = x * y;

        }
return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The value of a: ");
        int a = sc.nextInt();
        System.out.print(" Enter The value of b: ");
    int b = sc.nextInt();
    int result = cal(a, b);
     // without static
       // methods obj = new methods();
        //int result = obj.cal(a, b);
    System.out.println(result);

    sc.close();
}

}

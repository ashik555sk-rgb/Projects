import java.util.*;

class square {
    int side;

    public int area() {
        return side * side;
    }

    public int parameter() {
        return 4 * side;
    }
}

class rectangle {
    int l;
    int b;

    public int area() {
        return l * b;
    }

    public int parameter() {
        return 2 * (l + b);
    }
}
class circle{
    int r;
    public float  area(){
        return 3.14f *r;
    }
    public float circumfrance (){
        return 2*3.14f*r;
    }
}

public class oop_question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // problem 3;
        square sq = new square();
        System.out.println("ENTER YOUR Side ");
        sq.side = in.nextInt();
        System.out.println("AREA OF SQUARE IS :" + sq.area());
        System.out.println("PARAMETER OF SQUARE IS : " + sq.parameter());
        // problem 4;
        rectangle rec = new rectangle();
        System.out.print("Enter your lenght :");
        rec.l = in.nextInt();
        System.out.print("Enter your bredth");
        rec.b = in.nextInt();
        System.out.println("Area of Rectangle is: " + rec.area());
        System.out.println("Parameter of Rectangle is: " + rec.parameter());
        //problem 6;
        circle c = new circle();
        System.out.println("Enter your radius");
        c.r = in.nextInt();
        System.out.println("Area of circle is: " + c.area());
        System.out.println("Circumfrence of a circle is: " + c.circumfrance());

    }

}

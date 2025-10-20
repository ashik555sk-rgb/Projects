//public class methods_overloading {
// static void jokes() {
//     System.out.println(" Why do Java developers wear glasses? Because they don't see sharp.");
// }

// static void change(int[] arr) {
//     arr[5] = 98;
// }

// public static void main(String[] args) {
//     // jokes();
//     int[] marks = { 10, 89, 67, 78, 57, 85 };
//     change(marks);
//     System.out.println("The value of array after change: " + marks[5]);
// }

//}
//method overloading
public class methods_overloading {
    static void bro() {
        System.out.println("good morning bro!");
    }

    static void bro(String a , String b) {// Argument pass
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!" );
    }
    static void bro (String c){
        System.out.println("good morning "+ c + " bro!");
    }

    public static void main(String[] args) {
        bro();
        bro("Aashik" , "Rahul");
        bro("Nikhil");
    }
}
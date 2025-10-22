public class varargs{
    static int sum ( int...arr){
        int result = 0;
        for(int a: arr){
            result  +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum ( 2,5,6,7,8,9));
        System.out.println(sum(2,44,4,5,55,65,6));
    }
}
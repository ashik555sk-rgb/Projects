public class pattrens {
    public static void main(String[] args) {
        //PRINT RIGHT HALF PYRAMIND;
        int n = 4;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.print("\n");
        // }
        //print reverse half pyramid;

        // for (int i = 0; i<=n; i++){
        //     for(int j = 0; j<=n-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 -i ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        }

}

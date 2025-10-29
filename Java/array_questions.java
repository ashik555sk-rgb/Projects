public class array_questions {
    public static void main(String[] args) {
        // question 1: calculate the sum of all the elements of the array
        // /* */ float [] marks ={ 10.5f, 20.5f, 30.5f, 40.5f};
        // float sum = 0;
        // for( float element : marks){
        // sum = sum+element;
        // System.out.println("SUM OF THE ARRAY IS : "+ sum);
        // }
        // question 2 find the element in the array
        // int [] numbers = {1,2,3,4,5,6,7,8,9};
        // int num= 1;
        // boolean is = false;
        // for(int element:numbers){
        // if(num==element){
        // is= true;
        // break;
        // }
        // }
        // if(is){
        // System.out.println("number is present");

        // }else{
        // System.out.println("number is not present");
        // }
        // question 3 average of the array
        // int []marks = {89,56,78,98,45};
        // int sum = 0;
        // int avg = 0;
        // for (int i=0; i<marks.length; i++){
        // sum = sum+ marks[i];
        // }
        // avg = sum/marks.length;
        // System.out.println("average of the array is : "+ avg);

        // }
        // question 4 add two matrices
        // int [][] mat1 = {
        // {1,2,3},
        // {4,5,6}
        // };
        // int [][] mat2 = {
        // {7,8,9},
        // {10,11,12}
        // };
        // int [][] result = {
        // {0,0,0},
        // {0,0,0}
        // };
        // for ( int i = 0; i<mat1.length;i++){
        // for (int j= 0; j<mat1[i].length; j++){
        // result[i][j] = mat1[i][j]+mat2[i][j];
        // System.out.print(result[i][j]+" ");
        // System.out.print("");

        // }
        // System.out.println("");
        // }
        // question 5 reverse an array
        // int []arr = {1,2,3,4,5,6,7};
        // for(int i = arr.length - 1; i >= 0; i--){
        // System.out.println(arr[i]);
        // swap of array
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp = 0;
        // for (int i =0; i<n; i++)
        // {
        // temp = arr[i];
        // arr[i] =arr[l-1-i];
        // arr[l-1-i]= temp;
        // }
        // for(int element :arr){
        // System.out.print(element+" ");
        // }
        // question 6 find the maximum element in the array
        int[] arr = { 1, 2, 3, 89, 5, 6, 7 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                
            }
        }
        System.out.println("maxx element is :" + max);
    }
}

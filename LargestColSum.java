import java.util.Scanner;

public class LargestColSum {
    public static int largestColSum(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0; j<cols; j++){
            int sum=0;
            for(int i=0; i<rows; i++){
                sum +=arr[i][j];
            }
            System.out.println(sum + " ");
            if(sum > largest){
                largest=sum;
            }
        }
        return largest;
    }
    // public static int[][] inputArray(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the number of rows");
    //     int rows=sc.nextInt();
    //     System.out.println("enter the number of columns");
    //     int cols=sc.nextInt();
    //     int arr[][]=new int[rows][cols];
    //     for(int i=0; i<rows; i++){
    //         for(int j=0; j<cols; j++){
    //             System.out.println("Enter the number at" + i + " rows " + j + " columns ");
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     return arr;
    //  }
    public static void main(String[] args){
        // int arr[][]=inputArray();
        int arr[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int larColSum=largestColSum(arr);
        System.out.println(larColSum);
    }
}

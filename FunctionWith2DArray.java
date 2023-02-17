import java.util.Scanner;

public class FunctionWith2DArray {
    public static void printArray(int arr[][]){
        int rows=arr.length;
         int cols=arr[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
     public static int[][] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("enter the number of columns");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the number at" + i + " rows " + j + " columns ");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
     }
    public static void main(String[] args){
        int result[][]=inputArray();
        printArray(result);
    }
}

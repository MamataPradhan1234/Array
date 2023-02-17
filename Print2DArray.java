import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args){
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
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

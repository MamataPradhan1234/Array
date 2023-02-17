import java.util.Scanner;

public class LargestRowOrColumn {
    public static void largestRowOrColumn(int arr[][]){
        if(arr.length==0){
            System.out.print("row 0 -2147483648");
            return;
        }
        int larRow=Integer.MIN_VALUE;
        int row_index=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[0].length; j++){
                sum +=arr[i][j];
            }
            if(sum>larRow){
                larRow=sum;
                row_index=i;
            }
        }
        int larCol=Integer.MIN_VALUE;
        int col_index=0;
        for(int j=0; j<arr[0].length; j++){
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum +=arr[i][j];
            }
            if(sum>larCol){
                larCol=sum;
                col_index=j;
            }
        }
        if(larRow > larCol){
            System.out.print(" row- " +row_index + " LarRowSum- " + larRow);
        }else{
            System.out.print(" column- " + col_index + " LarColSum=  " + larCol);
        }
    }

    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number of rows");
        // int rows=sc.nextInt();
        // System.out.println("enter the number of columns");
        // int cols=sc.nextInt();
        // int arr[][]=new int[rows][cols];
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        int arr[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        largestRowOrColumn(arr);
    }
}

import java.util.Scanner;

public class MergeTwoArray {
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        //first array
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        //second array
        for(int j=0; j<m; j++){
            arr2[j]=sc.nextInt();
        }
        // int arr1[]={1, 4, 8, 10, 13, 17};
        // int arr2[]={2,3, 5, 7, 9, 11, 12};
        int arr3[]=mergeTwoArray(arr1 , arr2);
        printArray(arr3);
    }
}

import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0; i< n-1; i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j] > temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        printArray(arr);
    } 
}

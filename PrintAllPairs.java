import java.util.Scanner;

public class PrintAllPairs {
    public static void printAllPairs(int a[]){
        int n=a.length;
        for(int i=0; i<n-1; i++){
          for(int j=i+1; j<n; j++){
            System.out.print("(" + a[i] + "," + a[j] + ")");
          }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        printAllPairs(arr);
    }
    
}

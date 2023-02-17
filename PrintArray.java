import java.util.Scanner;

import javax.lang.model.element.Element;

public class PrintArray {
    public static void PrintArray(int a[]){
        int n=a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i]);
        }
    }
    public static int[] takeInput(){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];

      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      return arr;
    }
    public static void main(String[] args){
     int arr[]=takeInput();
     PrintArray(arr);
    }
}

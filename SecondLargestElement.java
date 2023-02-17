import java.util.Scanner;

public class SecondLargestElement {
    public static int secondlargest(int arr[]){
         int n=arr.length;
         if(n <=1){
            return -2147483648;
         }
        int first_lar=arr[0];
        int second_lar=-2147483648;
        for(int i=1; i< n; i++){
            if(arr[i] > first_lar){
               second_lar=first_lar;
               first_lar=arr[i];
            }else if(arr[i] > second_lar && arr[i]!=first_lar){
                second_lar=arr[i];
            }
        }
        if(second_lar == -2147483648){
            second_lar=-2147483648;
        }else{
            return second_lar;
        }
        return second_lar;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // int arr[]={9, 3, 6, 2 ,9};
        System.out.print(secondlargest(arr));
    }
}

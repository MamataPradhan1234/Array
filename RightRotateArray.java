public class RightRotateArray {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rightRotateArray(int arr[], int k){
        int n=arr.length;
        for(int i=0; i<k; i++){
            int last=arr[n-1];
            for(int j=n-1; j>0; j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
    }
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4, 5};
        int key=2;// number of times to rotate right
        rightRotateArray(arr, key);
        printArray(arr);
    }
}

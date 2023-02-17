public class SumOfTwoArray {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]){
        int na=arr1.length;
        int nb=arr2.length;
        int nc;
        int min;
        if(na > nb){
            nc=na+1;
            min=nb;
        }else{
            nc=nb+1;
            min=na;
        }
        int sum=0;
        int carry=0;
        int i=na-1;
        int j=nb-1;
        int k=nc-1;
        while(i >= 0 && j>=0){
            sum = arr1[i] + arr2[j]+carry;
            i--;
            j--;
            output[k]= sum%10;
            sum=sum/10;
            carry=sum%10;
            k--;
        }
        while(i >= 0){
            sum=arr1[i]+carry;
            output[k]=sum%10;
            sum=sum/10;
            carry=sum%10;
            i--;
            k--;
        }
        while(j >=0){
            sum=arr2[j]+carry;
            output[k]=sum%10;
            sum=sum/10;
            carry=sum%10;
            k--;
            j--;
        }
        output[k]=carry;
    }
}

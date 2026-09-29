
// import java.util.Scanner;

public class approach {
    public static void main(String [] args){
        int [] arr={1,3,2,4,6,5,4};
        int n= arr.length;
        int [] brr= new int[n+1];
        boolean flag=false;
        int value=0;

        for(int i=0;i<n;i++){
            if(brr[arr[i]]==1){
                flag=true;
                value=arr[i];
                break;
            }
            else brr[arr[i]]= 1;
        }

        if(flag==true) System.out.println("duplicate is in the array is :"+value);
        else System.out.println("duplicate element is not");
    }
}

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class insertion_sort {
    public static void main(String []args){
        

        /*insertion sort in ascendin order

        int []arr= {6,2,5,1,8,4};
        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/




        /*insertion sort in descending order */

        int []arr= {6,2,5,1,8,4};
        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

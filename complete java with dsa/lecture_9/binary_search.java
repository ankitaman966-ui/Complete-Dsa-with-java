import java.util.Scanner;
import java.util.Arrays;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Collections;



public class binary_search {
    public static void main(String []args){
        

        /*binary search to find target element 
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the target element :");
        int target = sc.nextInt();

        int []arr={1,4,6,7,9};
        int n=arr.length;

        int low=0,high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("target occur at the index :"+mid);
                break;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        System.out.println("target elementt not found"); */






        /*binary code to find the first iteration of target element 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the target element :");
        int target= sc.nextInt();

        int arr[]={1,4,5,7,7,7,8,9,9};

        int n=arr.length;
        int low=0,high=n-1;
        int index=-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                index=mid;
                high=mid-1;
            }
            
        }
        System.out.println("the target element found at this indext "+index );*/

    




        /*binary code to find the last iteration of target element 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the target :");
        int target=sc.nextInt();

         int arr[]={1,4,5,7,7,7,8,9,9};
         int n=arr.length;

         int low=0,high=n-1;
         int index=-1;

         while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else{
                index=mid;
                low=mid+1;
            }
         }
         System.out.println("target at index :"+index);*/



         
        /* binary search in descending order sorted array 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the target :");
        int target=sc.nextInt();

        int []arr = {100,90,80,70,60,50,40};
        int n=arr.length;
        int low=0,high=n-1,index=-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) low=mid+1;
            else if(arr[mid]<target) high=mid-1;
            else{
                index=mid;
                break;
            }
        }
        System.out.print("index ="+index);*/


        


        /*finding peak in mountain array 

        int []arr={1,3,4,5,6,8,5,4,2};
        int n=arr.length;
        int low=0,high=n-1;
        int peak=-1;

        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[mid+1]) low=mid+1;
            else high=mid;
        }
        System.out.printf("%d and %d",low,arr[low]); */





        /*floor in sorted array */

        int []arr={1,3,4,5,6,8,5,4,2};
        int n=arr.length;
        
        Scanner sc= new Scanner(System.in);
        System.out.printl("Enter the value of x :");
        int x=sc.nextInt();

        int low=0,high=n-1,idx=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x) high=mid-1;
            else{
                idx=mid;
                low=mid+1;
            }
        }
        System.out.println(idx);


    }
}

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class selection_sort{
    public static void main(String [] args){
        

        /* selection sort 

        int []arr={6,5,4,3,2,1};
        int n=arr.length;
        int index = -1;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[index];
            arr[index]=t;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/



        /* 2 sum find pair with given sum 
        
        Scanner sc= new Scanner(System.in);
        int []arr={7,2,4,3,-1,8,6};
        int n=arr.length;
        System.out.print("Enter the length :");
        int target=sc.nextInt();
        Arrays.sort(arr);

        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.printf("the pairs is : %d and %d\n",arr[i],arr[j]);
                j--;
                i++;
            }
            else if(arr[i]+arr[j]>target) j--;
            else i++;
        }*/


        


        /*return new array with common element of other two array 

        int []arr= {1,7,4,2,5,6};
        int []brr= {1,4,2,7,8,2};
        ArrayList<Integer> array= new ArrayList<>();
        int n=arr.length;
        int m=brr.length;

        Arrays.sort(arr);
        Arrays.sort(brr);

        int i=0,j=0;

        while(i<n && j<m){
            if(arr[i]==brr[j]){
                array.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]>brr[j]) j++;
            else i++;
        }
        System.out.println(array);*/




        /*union of two sorted array 

        int []a={1,2,6,8,};
        int []b={2,2,5,6,9};

        ArrayList<Integer> arr=new ArrayList<>();

        int i=0,j=0;

        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) !=a[i]){
                    arr.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) !=b[j]){
                    arr.add(b[j]);
                }
                j++;
            }
            else{
                if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i]){
                    arr.add(a[i]);
                }
                i++;
            }
        }
        while(i<a.length){
            if(arr.isEmpty()|| arr.get(arr.size()-1) !=a[i]){
                arr.add(a[i]);
            }
            i++;
        }

        while(j<b.length){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=b[j]){
                arr.add(b[j]);
            }
            j++;
        }

        System.out.println(arr);*/





        /*find the kth smallest element 

        int n=arr.length;
        
        int index=-1;
        
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[index];
            arr[index]=t;
        }
        return arr[k-1];*/
        



        //  union of the two array

        int []a={1,2,6,8,};
        int []b={2,2,5,6,9};
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;

        Arrays.sort(a);
        Arrays.sort(b);

        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) !=a[i]) arr.add(a[i]);
                i++;
                j++;
            }
            
            else if(a[i]>b[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) !=b[j]) arr.add(b[j]);
                j++;
            }

            else{
                if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i]) arr.add(a[i]);
                i++;
            }
        }
        while(i<a.length){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i]) arr.add(a[i]);
            i++;
        }
        while(j<b.length){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=b[j]) arr.add(b[j]);
            j++;
        }

        System.out.println(arr);
    }
}


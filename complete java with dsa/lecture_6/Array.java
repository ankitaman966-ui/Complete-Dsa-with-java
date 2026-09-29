import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String []args){


        /*making array and taking input from user and display it 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the array :");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.print("enter the element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(i +"->"+arr[i]+" ");
        }  */




        
        /*printing the maximum and minimum value of array take array element form user 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the array :");
        int n=sc.nextInt();

        int [] arr= new int[n];
        System.out.print("enter all the elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.printf("minimum value is :%d\nmaximum value is :%d",min, max); */






        /*printing the sum of the array 

        Scanner sc= new Scanner(System.in);
        int []arr= {10,20,30,40};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of the element of the array :"+sum);
        sc.close();  */





        /* search the element in the array 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the element to search :");
        int search=sc.nextInt();
        int []arr= {10,20,30,40};
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(search==arr[i])  flag=true; 
        }
        
        if(flag==true) System.out.println("element present in the array");
        else System.out.println("element not present in the array"); */





        
        /*deep copy of an array 

        Scanner sc= new Scanner(System.in);
        sc.close();
        int [] arr= {10,20,30};
        int [] x = Arrays.copyOf(arr,arr.length);
        x[2]=100;
        System.out.print(arr[2]+ "and "+ x[2]);  */






        /*multiply odd indexed element by 2 and add 10 to even index element 

        int []arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0) arr[i]*=2;
            else arr[i]+=10;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }*/






        /*reverse the element of the array using for loop 

        Scanner sc=new Scanner(System.in);
        sc.close();

        int []arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int t=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=t;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/






        /*reverse the element of the array using for while loop 

        Scanner sc=new Scanner(System.in);
        sc.close();

        int []arr={1,2,3,4,5};
        int n=arr.length;
        
        int i=0,j=n-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }*/
        



        /*Two sum 

        Scanner sc=new Scanner(System.in);
        
        int []arr={1,2,3,4,5};
        int n=arr.length;
        System.out.print("enter the target :");
        int target=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=arr[i]+arr[j];
                if(sum==target) flag=true;
            }
        }

        if(flag==true) System.out.println("target found");
        else System.out.println("target not found");  */




        

        /*print the second maximum elemenet in the array 

        Scanner sc= new Scanner(System.in);
        sc.close();

        int [] arr={2,4,5,3,1};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }       
            else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i]
            }
        }
        System.out.printf("max element :%d and second max :%d",max,smax);  */





        /* to reverse the selected part at the arrray 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the position to reverse the selected part :");
        int pos=sc.nextInt();
        
        int []arr={10,20,30,40,50,60,70};
        int n=arr.length;

        reverse(arr,0,pos-1);
        reverse(arr,pos,n-1);
        reverse(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
    public static void reverse(int []arr,int i,int j){
            while(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;

            }
    }*/ 


         
         

        /* find the missing element in the array 

        int[] arr={};
        long n=arr.length+1;
        long sum=n*(n+1)/2;
        long arrsum=0;
        for(int ele:arr) arrsum+=ele;
        System.out.println((long)(sum-arrsum));*/







        /* to recreate the arr in systmatic way

        Scanner sc=new Scanner(System.in);
        sc.close();
        int [] arr={1,0,1,0,1,0,0};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        for(int ele:arr) System.out.print(ele +" ");*/



        

        
        
        /* wave array*/

        Scanner sc=new Scanner(System.in);
        sc.close();

        int [] arr={1,2,4,5,7,9};
        int n=arr.length;
        for(int i=1;i<n;i=i+2){
            int t=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=t;
        }

        for(int ele:arr) System.out.print(ele+" ");
        
    }
}
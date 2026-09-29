import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class arraylist {
    public static void main(String [] args){


        /* making arraylinst integer 

        ArrayList <Integer> arr= new ArrayList<>();
        arr.add(35);
        arr.add(50);
        arr.add(60);
        arr.add(10);
        arr.set(0,10);
        System.out.println("value at index 0 ="+arr.get(0));
        System.out.println("value at index 1 ="+arr.get(1));
        System.out.println("arraylist ="+arr);
        System.out.println("the size of the array is"+arr.size());
        arr.remove(0);
        System.out.println("arraylist ="+arr);*/

        




        /* Adding one in array 

        int [] arr={9,9,9};
        ArrayList<Integer> mrr = new ArrayList<>();
        int n=arr.length;
        int c=1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+c <=9){
                mrr.add(arr[i]+c);
                c=0;
            }
            else{
                mrr.add(0);
            }
        }
        if(c==1) mrr.add(1);
        Collections.reverse(mrr);
        System.out.println(mrr);   */




        /*add one in an array in other method

        int[] arr = {9, 9, 9};
        ArrayList <Integer> arrlist= new ArrayList<>();

        int n=arr.length-1;
        int c=1;

        while(n>=0 || c!=0){
            int sum=c;
            if(n>=0) sum+=arr[n--];
            arrlist.addFirst(sum%10);
            c=sum/10;
        }
        System.out.println(arrlist); */





        /* add two array just like above  

        int[] arr = {9, 9, 9};
        int[] brr = {1, 1};

        LinkedList<Integer> result = new LinkedList<>();

        int m = arr.length - 1;
        int n = brr.length - 1;
        int carry = 0;

        while (m >= 0 || n >= 0 || carry != 0) {

            int sum = carry;

            if (m >= 0) sum += arr[m--];
            if (n >= 0) sum += brr[n--];

            result.addFirst(sum % 10);  // 🔥 no reverse needed
            carry = sum / 10;
        }

        System.out.println(result);*/





        /* merge two sorted array 


        int [] arr={1,2,3,4};
        int[]brr = {5,6,7,8};

        int [] ans=new int[arr.length+brr.length];
        merge(arr,brr,ans);
        for(int ele:ans) System.out.print(ele +" ");
        
    }

        public static void merge(int [] arr,int []brr,int []ans){
            int i=0,j=0,k=0;
            while(i<arr.length && j<brr.length){
                ans[k++]=(arr[i]<brr[j]) ? arr[i++] : brr[j++];
            }

            while(i<arr.length){
                ans[k++]=arr[i++];
            }
            while(j<brr.length){
                ans[k++]=brr[j++];
            }
        }*/



        
    }
    
}

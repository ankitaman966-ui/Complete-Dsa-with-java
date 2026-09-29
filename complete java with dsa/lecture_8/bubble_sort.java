public class bubble_sort {

    public static void main(String [] args){


        
        /* sort in ascending order 

        int []arr= {1,4,2,6,3,5};
        int n=arr.length;

        for(int i=0;i<n-1;i++){

            int swap=0; // this variable is used to for checking if array swaped then break

            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swap++;
                }
            }
            if(swap==0) break; //cheking swap then break
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");  */





        /* bubble  sort in descending order 

        int []arr= {1,4,2,6,3,5};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swap++;
                }
            }
            if(swap==0) break;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/



        

        /* move all zero to right side */

        int [] arr={10,0,2,0,4,30,0,9,0,0,7};
        int n=arr.length;

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

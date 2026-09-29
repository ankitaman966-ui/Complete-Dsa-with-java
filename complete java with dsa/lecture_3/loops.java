import java.util.Scanner;

public class loops{
    public static void main(String []args){
        

        /*printing the even number form 1 to 10 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0) System.out.print(i+" ");

        }*/




        /*printing the Ap series 2,5,8,11--- nth term input by user

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the nth term :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(3*i-1+" ");
        }*/





        /* printing the value like this 1 n 2 n-1 3 n-3  takin n input form user


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the last tern :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
            System.out.println(n+1-i);
        }*/



        /*printing the ascii value 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the last tern :");
        int n=sc.nextInt();
        for(int i=65;i<=n;i++){
            System.out.println(i + " " +(char)i );
        }*/

        


        /*check wheather the ginven number is composite or not 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        boolean flag=false;
        if(n<=1){
            System.out.println("neither prime nor composite");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) flag=true;
            }
            if(flag==true) System.out.println("the given no is composite number");
            else System.out.println("the given no. is prime no");
        }*/





        /*printing the factor of the given number 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n= sc.nextInt();
        if(n<=1) System.out.println("no factor available");
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0 && i!=n/i){
                    System.out.print(i);
                    System.out.println("->"+n/i);

                }
            }
        }*/




        /* couting the digit of the number 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.printf(" %d digits number",count);*/






        /* reversing the number 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n= sc.nextInt();
        int flag=0;
        if(n==0) n=1; # because 0 is also one digit number
        while(n!=0){
            int rem=n%10;
            flag= flag*10 + rem;
            n/=10;
        }
        System.out.println("reversing completed :"+flag);*/





        /* check the given number is armstrong number or not 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n= sc.nextInt();
        int copy=n;
        int flag=0;
        int length=String.valueOf(n).length();

        while(n!=0){
            int rem=n%10;
            flag = flag + (int)Math.pow(rem,length);
            n/=10;
        }

        if(flag==copy) System.out.println("the given number is amrstrong number");
        else System.out.println("the given number is not armstrong number"); */

        



        /*factorial of a number 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n= sc.nextInt();
        int fact=1;
        if(n==0){
            System.out.println("factorial of 0 is "+1);
            return ;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.printf("the factorial of the %d is %d",n,fact);*/






        /* calutating the power of the number 

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        System.out.print("enter the power :");
        int p= sc.nextInt();
        int pow=1;
        
        for(int i=1;i<=p;i++){
            pow*=n;
        }

        System.out.println(pow);  */
        
    }   
}
        
        
        
        
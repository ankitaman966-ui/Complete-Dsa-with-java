import java.util.Scanner;

public class conditions {
    public static void main(String [] args){
        

        /* checking for even or odd 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.printf("the given number %d is even number",n);
        }
        else System.out.printf("The given number %d is odd number",n); */




        /* print the absolute value of the given number

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        if(n>=0)  System.out.printf("the absolute value of the given number is :%d",n);
        else  System.out.printf("the absolute value of the given number is :%d",-n); */





        /*cheking the input number is interger or not 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        double n= sc.nextDouble();
        int  x= (int)n;
        if(n-x>0) System.out.println("it is not interger");
        else System.out.println("it is interger");  */





        /*checking the profit and loss cost price and selling price is taken from user 

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the cost price :");
        double cost_price= sc.nextDouble();
        System.out.print("Enter the selling price :");
        double selling_price= sc.nextDouble();

        if(selling_price==cost_price) System.out.println("no profit no loss");
        else if(selling_price>cost_price) System.out.printf("profit is %.2f",(selling_price-cost_price)/cost_price *100);
        else System.out.printf("loss is %.2f",-(selling_price-cost_price)/cost_price *100);
        sc.close();*/





        /*taking input number and tell if it is four digit or not 


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        if(n>999 && n<9999) System.out.println("number is four digit number");
        else System.out.println("not four digit number");
        sc.close();*/




        /* input the sides of the triangle and check it form triangle or ont 

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side 1 :");
        double a= sc.nextDouble();
        System.out.print("Enter the side 2 :");
        double b= sc.nextDouble();
        System.out.print("Enter the side 3 :");
        double c= sc.nextDouble();

        if(a+b>c && a+c>b && b+c>a) System.out.println("valid triangle");
        else System.out.println("not valid triangle");
        sc.close();*/




        /* take three number as input and print greatest number
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter three number :");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c) System.out.printf("%d is greater",a);
            else System.out.printf("%d is greater",c);
        }
        else{
            if(b>c) System.out.printf("%d is greater",b);
            else System.out.printf("%d is greater",c);
        } */





        /* use of ternary operator */

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();

        int ans= (n>=0) ? 100 : 10;

        System.out.println(ans);
    }
}

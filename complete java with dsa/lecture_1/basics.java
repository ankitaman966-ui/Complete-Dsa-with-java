import java.util.Scanner;

// import java.util.*;  -> to input all module approx all 

public class basics{

    /*print name given by user 

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name= sc.nextLine();
        System.out.println("Your name is :"+name);
        sc.close();

    }*/




    /* Area of cirlce 

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        float radius =sc.nextFloat();
        float area= 3.1415f * radius * radius ;
        System.out.println("area of the circle is :"+ area);
        sc.close();
    }*/





    /*volume of the square 

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of sphere :");
        double radius= sc.nextDouble();
        double pi= Math.PI;
        double volume = 4.0/3.0* pi * Math.pow(radius,3);
        System.out.println("the volume of the sphere is "+volume);

    }*/



    

    /*square of a number 

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.printf("The square of the number is %d", n*n); // format specifier

    }*/






    /* addint three number input from user

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number :");
        int n1=sc.nextInt();
        System.out.print("Enter the second number :");
        int n2=sc.nextInt();
        System.out.print("Enter the third number :");
        int n3=sc.nextInt();
        System.out.printf("The sum of three number is :%d",n1+n2+n3);

    }*/



    /* calculating the simple interest

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the principle amount :");
        double amount= sc.nextDouble();
        System.out.print("Enter the rate of interest :");
        Double rate= sc.nextDouble();
        System.out.print("Enter the time period :");
        Double time= sc.nextDouble();

        Double si=(amount*time*rate)/100;
        System.out.printf("simple interest is :%.2f",si);
        
    } */

}


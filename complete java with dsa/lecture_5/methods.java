import java.util.Scanner;

public class methods {
    public static void main(String []args){


        /* Math built in function in java types */

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        double n=sc.nextDouble();

        System.out.println(Math.sqrt(n));   // print sqrtroot of the numebr
        System.out.println(Math.cbrt(n));   // prit cube root 
        System.out.println(Math.abs(n));    // print absolute value means only positive number
        System.out.println(Math.floor(n));  // works as greatest integer funtion decrease the value
        System.out.println(Math.ceil(n));   // increase to the next number
        System.out.println(Math.min(6,2));  // print min value
        System.out.println(Math.max(5,4));  // print max value       

    }
}

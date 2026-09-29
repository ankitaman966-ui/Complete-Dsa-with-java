import java.util.Scanner;

public class pattern_printing {
    public static void main(String []args){




        /* printing the square box    * * *
                                      * * *
                                      * * *
                                      
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the pattern :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/





        /* printing the pattern like this   * 
                                            * * 
                                            * * * 
                                            * * * *   

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the pattern :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }*/



        /*printing  1 2 3 4 5 
                    1 2 3 4 5  
                    1 2 3 4 5 
                    1 2 3 4 5 

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.of row :");
        int row =sc.nextInt();
        System.out.print("enter the no. of columns :");
        int col =sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }*/





        /*printing like 1 1 1 1 1 
                        2 2 2 2 2
                        3 3 3 3 3
                        4 4 4 4 4
                        5 5 5 5 5
         
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int col =sc.nextInt();
        for (int i=1;i<=row; i++){
            for (int j=1; j<=col;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/


        


        /*printing alphabet A B C D  or A A A A    ONLY CHANGE IN j AND i
                            A B C D     B B B B    code can be written in 
                            A B C D     C C C C    different ways next example
                            A B C D     D D D D    check it    

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row :");
        int row= sc.nextInt();
        System.out.print("enter the column");
        int col= sc.nextInt(); 

        for(int i=65;i<=64+row;i++){
            for(int j=65;j<=64+col;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }*/





        /*printing alphabets a a a a  OR  a b c d   Only change in i and j
                             b b b b      a b c d   code can be written in
                             c c c c      a b c d   different ways 
                             d d d d      a b c d   

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row :");
        int row= sc.nextInt();
        System.out.print("enter the column");
        int col= sc.nextInt();
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print((char)(96+i) +" ");
            }
            System.out.println();
        }*/



        /* pattern like 1           OR  print i    1
                        A B                        B B
           print j      1 2 3                      3 3 3 
                        A B C D                    D D D D  
                        1 2 3 4 5                  5 5 5 5 5 

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row :");
        int row= sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(j+" ");
                }
                else System.out.print((char)(64+j)+ " ");
            }
            System.out.println();
        }*/





        
        /* printing patter like this     


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length :");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/






        /*printing patter   1 2 3 4 5
                            1 2 3 4
                            1 2 3
                            1 2
                            1         

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length :");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/





        /*printing pattern  5 4 3 2 1 
                            4 3 2 1   
                            3 2 1     
                            2 1   
                            1         

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length :");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n+1-i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        } */





        /* pattern rectangular   * * * * * * *
                                 *           *
                                 *           *
                                 *           *
                                 * * * * * * *    

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.of row :");
        int row =sc.nextInt();
        System.out.print("enter the no. of columns :");
        int col =sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || j==col|| i==row){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.err.println();
        }*/






        /* patter like this       *     
                                  *
                              * * * * *
                                  *
                                  *         
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter only odd number==");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==n/2+1 || j==  n/2+1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }*/




        

         /*print example like       
                                  *       *
                                    *   *
                                      *
                                    *    *
                                  *        *     
        

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length only in odd number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }*/

        



        /* binary triangl   1
                            01
                            101
                            0101
                            10101   


        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("  ");
        } */





        /* vertically flipped like this         1 
                                              1 2
                                            1 2 3
                                          1 2 3 4
                                        1 2 3 4 5  

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */




        
        /* patter like this     * * * * 
                                  * * * 
                                    * * 
                                      *

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
               System.out.print("  "); 
            }
            for (int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        




        /* pattern pyramid            * 
                                    * * *
                                  * * * * *
                                * * * * * * *
                              * * * * * * * * *    

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/







        /* pattern pyramid            * 
                                    * * *
                                  * * * * *
                                * * * * * * *
                              * * * * * * * * *
                                * * * * * * *
                                  * * * * *
                                    * * *   
                                      *           

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  */





        
        /* pattern bridge   * * * * * * * * * 
                            * * * *   * * * * 
                            * * *       * * * 
                            * *           * * 
                            *               *          

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   */


    }
}

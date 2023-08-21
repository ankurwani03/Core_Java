import java.util.Scanner;
public class scanner 
{
public static void main(String args[])
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("enter the number");
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.println("enter number of a is:"+a);
   System.out.println("enter number of b is:"+b);
   System.out.println("sum of A and B is :"+(a+b));
 }
}
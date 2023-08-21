import java.util.Scanner;
public class Swap
{
public static void main(String args[])
 {
  int a=2;
  int b=3;
  System.out.println("Befor Swaping number ");
  System.out.println("First number is :"+a);
  System.out.println("Second number is:"+b);

  int temp=a;
   a=b;
   b=temp;
  System.out.println("After  Swaping number ");
  System.out.println("First number is :"+a);
  System.out.println("Second number is:"+b);
 }
}
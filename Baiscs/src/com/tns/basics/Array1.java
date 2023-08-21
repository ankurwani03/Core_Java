public class Array1
{
public static void main(String args[])
{
String bikes[]={"KTM","BMW","AVENGER","R15"};
for (int i=0;i<bikes.length;i++)
{
System.out.println(bikes[i]);
}
for (String i:bikes)
{
System.out.println(i);
}
}
}
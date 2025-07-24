import java.util.*;
public class SwapWithoutTemp
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number:");
a=sc.nextInt();
System.out.println("enter 2nd number:");
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swap:");
System.out.println("a: "+a);
System.out.println("b: "+b);
}
}




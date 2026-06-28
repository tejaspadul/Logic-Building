import java.util.Scanner;

public class LCM {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        int x=num1;
        int y=num2;
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}

import java.util.Scanner;

public class GCDProgram {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter Second number:");
        int num2=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=Math.min(num1,num2);i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD is:"+gcd);
    }
}


/*
now what is GCD it means highest number which divide both number is gcd of both 
if no gcd found then 1 should be greatest GCD of both number
ex-18,12 here at starting GCD=1 then i++ and it divide both and which i divide both should be GCD of it
here 6 should be GCD
*/

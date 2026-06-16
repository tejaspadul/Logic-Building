import java.util.Scanner;

public class Factorial {
    public static void main (String[]args)
    {
        int num;
        int i;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number want factorial: ");
         num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}

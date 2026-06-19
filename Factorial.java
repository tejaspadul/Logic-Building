import java.util.Scanner;

public class Factorial {
    public static void main (String[]args)
    {
        int num,i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number want factorial: ");
         num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}

/*
to find factorial of any number we just mulply that number from 1 to itself is factorial 
ex-factorial of 5=1*2*3*4*5=120
so we can see that to find any number factorial we only multiply it from 1 to itself
*/

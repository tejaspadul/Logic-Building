import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number you want to check its palindrome or not :");
        int num=sc.nextInt();
        int original=num;
        int rev=0;
        while(num!=0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(original == rev) {
            System.out.println(original+" is Palindrome Number");
        } else {
            System.out.println(original+" is Not Palindrome Number");
        }
    }
}

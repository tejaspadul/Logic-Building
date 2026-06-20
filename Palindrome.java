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


/* 
What is palindrome number it means a number which is same when we reverse it its palindrome number 
ex:- num=1221
     rev=1221 so here we can see both number are same when we reverse original
ex of palindrome:- 121,1221,123321,1111,223322..............
*/

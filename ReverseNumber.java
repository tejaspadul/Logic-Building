import java.util.Scanner;
public class ReverseNumber {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number you want to reverse:");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println("reverse of given num is:"+rev);
    }
}

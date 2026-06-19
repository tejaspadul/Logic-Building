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

/*

how actually a reverse of number program work so in this program when we enter any number it print reversly 
ex:- 123456789
op:-987654321
so for this we use while loop and in that we just put one condition while num!=0 then we just write rev = rev * 10 + num % 10

*/

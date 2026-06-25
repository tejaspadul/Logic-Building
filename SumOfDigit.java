import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int originalnum=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of digit of number "+originalnum+" is:"+sum);
    }
}

/*
Sum of digit of number means we add all element of given number to calculate its sum
ex: 1234=1+2+3+4 i.e 10
so for this in this program we take an input number from user
then we store it in one number for later use of original number
then we assign sum=0
then we use while loop until condition is true then we use main logic
digit=num%10 then sum=digit+sum then num/10 and  then we print it outside of while loop
ex:- input:123456789 output:45
*/

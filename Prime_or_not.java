/*
import java.util.Scanner;

public class Prime_or_not {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        boolean isprime=true;
        if(num<=1){
            isprime=false;
        }else{
           for(int i=2;i<num;i++){
               if(num%i==0){
                   isprime=false;
                   break;
               }
           }
        }
        if(isprime){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }
    }
}
*/

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2)
            System.out.println(num+" is Prime Number");
        else
            System.out.println(num+" is not Prime Number");
    }
}

/*
Prime number means the given number is divisible by 1 or itself so its prime
ex- 2,3,5,7,11,13,17,19....
so look this given numbers this all are prime and if we check all are divisible by 1 and only by itself 

so for checking number is prime or not we only check that number is divisible by more than 2 number if yes then its not prime and if number is only divisible by 2 then its prime
and always remember 1 is not prime number and 2 is only even prime number

*/

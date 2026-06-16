import java.util.Scanner;
public class Even_odd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        else{
            System.out.println(num+" is an odd number");
        }           
    }
}

/*
to check number is even or odd we only want to check that number%2==0 if yes then number is even otherwise number is odd
ex-2,4,6,8,10.... here we can see every number is divisible by 2 so its even
ex-1,3,5,7,9..... here we can see every number is not exactly divisible by 2 so its odd

so to check every number is even or odd we only need to if-else to check the condition that number is divisible by 2 or not
*/

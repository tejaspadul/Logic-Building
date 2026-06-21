import java.util.Scanner;

public class LargestNumber {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter third number: ");
            int c = sc.nextInt();

            if (a >= b && a >= c) {
                System.out.println("Largest number is: " + a);
            }
            else if (b >= a && b >= c) {
                System.out.println("Largest number is: " + b);
            }
            else {
                System.out.println("Largest number is: " + c);
            }

            sc.close();
        }
    }

/*
to fing largest number among three number is that we compare three number with each other and print greatest among them
ex- 12,23,34  here we compare 12 with 23,34 is greater or not then we compare 23 with 12,34 greater or not if first two codition are not satisfied 
then third will be definetly true so here 34 is greatest
*/

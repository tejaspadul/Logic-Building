import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

/*

how actually a fibonacci program execute ?
so fibonacci series means next number will we the sum of previous two number and in fibonacci series we intitialize
first number as zero and and second as one then next number will be sum of this two then next will be some of 1+1 then next will be 2+1,3+2...........
fibo:-0,1,1,2,3,5,8,12,20,32,52..................
*/

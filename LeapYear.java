import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year+" is Leap year");
        }else{
            System.out.println(year+" is Not Leap year");
        }
    }
}

/*
what is leap year? 
so leap year comes after every 4 year and it should be divided by 4 or 400 is leap year
in calender 2000,2004,2008,2012,2016.......... is leap year and
2001,2002,2003,2005,2006,2007........... are not leap year 
so in programming for logic building Leap year program is basic but enhance logic and thinking ability
*/

import java.util.Scanner;
public class Assignment2
{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Year -- ");
        int year = x.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ?"Year " + year + " is a Leap Year" :"Year " + year +  " is Not A Leap Year");
    }
}
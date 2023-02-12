import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Ammount: ");
        float P = sc.nextFloat();
        System.out.println("Enter Time period: ");
        float t = sc.nextFloat();
        System.out.println("Enter rate of interest per year: ");
        float r = sc.nextFloat();
      
        float I =P*(1+r*t);
        System.out.println("The Simple Interest is "+I);
    }
}

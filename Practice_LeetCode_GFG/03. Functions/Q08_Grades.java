import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:

// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 
public class Q08_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        double mks=sc.nextInt();
        System.out.println("The grade is: "+findGrade(mks));
    }

    private static String findGrade(double mks) {
        if(mks>=91 && mks<=100){
            return "AA";
        }else if(mks>=81 && mks<=90){
            return "AB";
        }else if(mks>=71 && mks<=80){
            return "BB";
        }else if(mks>=61 && mks<=70){
            return "BC";
        }else if(mks>=51 && mks<=60){
            return "CD";
        }else if(mks>=41 && mks<=50){
            return "DD";
        }else if(mks<=40){
            return "Fail";
        }else{
            return "Incorrect marks entered";
        }
    }
    
}

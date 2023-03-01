import java.util.Scanner;

/* Area Of Circle, Triangle, Rectangle, Isosceles Triangle, Parallelogram,
Rhombus, Equilateral Triangle in Java*/



public class Q1_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do{
        System.out.println("\nSelect shapes of which you want to obtain area of:");
        System.out.println("1. Circle \n2. Triangle \n3. Rectangle \n4. Isosceles Triangle \n5. Parallelogram \n6. Rhombus \n7. Equilateral Triangle \n8. Exit");
        System.out.print("\nEnter your choice: ");
        ch = sc.nextInt(10);
            switch(ch){
            
                case 1: //Area of circle = pie*r*r
                System.out.print("Enter the radius: ");
                float radius = sc.nextFloat();
                float CircArea = (3.14f*radius*radius);
                /*The expression (3.14*radius*radius) is calculated using the double precision floating-point format, which has a higher precision than the single precision float format. When you assign the result to a float variable CircArea, the compiler is warning you that the conversion may result in a loss of precision.To fix this error, you can either change the type of CircArea to double to match the precision of the expression, or use a float literal for the value of 3.14 to ensure that the expression is calculated using single precision float arithmetic. */
                System.out.println("The area of circle is: "+CircArea);
                break;

                case 2: //Area of triangle = 0.5*b*h
                System.out.print("Enter base: ");
                float tbase = sc.nextFloat();
                System.out.print("Enter height: ");
                float theight = sc.nextFloat();
                System.out.println("Area of triangle is "+(0.5*tbase*theight));
                break;

                case 3: //Area of rectangle = length * breadth
                System.out.print("Enter length: ");
                double len = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double bread = sc.nextDouble();
                System.out.println("The area of rectangle is: "+(len*bread));
                break;

                case 4: //Area of Isosceles Triangle = 0.5*base*height
                System.out.print("Enter base: ");
                float isobase = sc.nextFloat();
                System.out.print("Enter height: ");
                float isoheight = sc.nextFloat();
                System.out.println("Area of Isosceles triangle is "+(0.5*isobase*isoheight));
                break;

                case 5: //Area of Parallelogram = base*height
                System.out.print("Enter base: ");
                float parbase = sc.nextFloat();
                System.out.print("Enter height: ");
                float parheight = sc.nextFloat();
                System.out.println("Area of Parallelogram is "+(parbase*parheight));
                break;

                case 6: //Area of Rhombus = 0.5*diagonal1*diagonal2
                System.out.print("Enter diagonal 1: ");
                float diag1 = sc.nextFloat();
                System.out.print("Enter diagonal 2: ");
                float diag2 = sc.nextFloat();
                System.out.println("Area of Rhombus is "+(0.5*diag1*diag2));
                break;

                case 7: //Area of Equilateral Triangle = ((3**(1/2))/4)*side*side
                System.out.print("Enter the side: ");
                float eqiside = sc.nextFloat();
                double areaequi=Math.sqrt(3)/4*Math.pow(eqiside,2);
                System.out.println("Area of Equilateral Triangle is "+(areaequi));
                break;
        }
    }while(ch!=8);
    System.out.println("\nExited..........\n");
    }
}

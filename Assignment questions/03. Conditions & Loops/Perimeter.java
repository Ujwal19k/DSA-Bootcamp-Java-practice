import java.util.Scanner;

/*Perimeter Of Circle, Equilateral Triangle, Parallelogram, Rectangle, Square, Rhombus */
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do{
        System.out.println("\nSelect shapes of which you want to obtain Perimeter of:");
        System.out.println("1. Circle \n2. Equilateral Triangle \n3. Parallelogram \n4. Rectangle \n5. Square \n6. Rhombus\n7. Exit");
        System.out.print("\nEnter your choice: ");
        ch = sc.nextInt(10);

        switch(ch){
            case 1: //Perimeter of circle = 2*pie*r
                System.out.print("Enter the radius: ");
                float radius = sc.nextFloat();
                float CircPeri = (2*3.14f*radius);
                System.out.println("The Perimeter of circle is: "+CircPeri);
                break;
            
            case 2: //Perimeter of equi triangle = 3*side
                System.out.print("Enter the side: ");
                float side = sc.nextFloat();
                float TriPeri = (2*3.14f*side);
                System.out.println("The Perimeter of Equilateral triangle is: "+TriPeri);
                break;

            case 3: //Perimeter of Parallelogram = 2(a+b)
                System.out.print("Enter adjacent side 1: ");
                float aside1 = sc.nextFloat();
                System.out.print("Enter adjacent side 2: ");
                float aside2 = sc.nextFloat();
                System.out.println("Perimeter of Parallelogram is "+(2*(aside1+aside2)));
                break;

            case 4: //Perimeter of Rectangle = 2(l+w)
                System.out.print("Enter length: ");
                float length = sc.nextFloat();
                System.out.print("Enter width: ");
                float width = sc.nextFloat();
                System.out.println("Perimeter of Parallelogram is "+(2*(length+width)));
                break;

            case 5: //Perimeter of square = 4*side
                System.out.print("Enter length: ");
                float sqside = sc.nextFloat();                
                System.out.println("Perimeter of Parallelogram is "+(4*sqside));
                break;

            case 6: //Perimeter of rhombus = 4*side
                System.out.print("Enter length: ");
                float rhoside = sc.nextFloat();                
                System.out.println("Perimeter of Parallelogram is "+(4*rhoside));
                break;
        }
        }while(ch!=7);
        System.out.println("\nExited........\n");
    }
}

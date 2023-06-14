import java.util.Scanner;

/*Curved Surface Area Of Cylinder and Total Surface Area Of Cube */
public class Q4_SurfaceArea {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int ch;

    do{
        System.out.println("\nSelect shapes of which you want to obtain Surface of:");
        System.out.println("1. Curved Surface Area Of Cylinder \n2. Total Surface Area Of Cube \n3. Exit");
        System.out.print("\nEnter your choice: ");
        ch = sc.nextInt(10);

        switch(ch){
            case 1: //Curved Surface Area Of Cylinder = 2*pie*r*h
                System.out.print("Enter the radius of Cylinder: ");
                float Cylrad = sc.nextFloat();
                System.out.print("Enter the Height of Cylinder: ");
                float Cylheight = sc.nextFloat();
                float SAcyl = (2*3.14f*Cylrad*Cylheight);
                System.out.println("The Curved Surface Area Of Cylinder is: "+SAcyl);
                break;

            case 2: //Total Surface Area Of Cube = 6*side*side
                System.out.print("Enter the side of Cube: ");
                float Cubeside = sc.nextFloat();
                float SAcube = (6*Cubeside*Cubeside);
                System.out.println("The Curved Surface Area Of Cylinder is: "+SAcube);
                break;
        }
    }while(ch!=3);
    System.out.println("\nExited........\n");
   } 
}

import java.util.Scanner;

/*Volume Of Cone, Prism, Cylinder, Sphere, Pyramid */
public class Q3_Volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;

        do{
        System.out.println("\nSelect shapes of which you want to obtain Volume of:");
        System.out.println("1. Cone \n2. Prism \n3. Cylinder \n4. Sphere \n5. Pyramid \n6. Exit");
        System.out.print("\nEnter your choice: ");
        ch = sc.nextInt(10);

        switch(ch){
            case 1: //Volume of Cone = pie*r*r*(h/3)
                System.out.print("Enter the radius of cone: ");
                float Conerad = sc.nextFloat();
                System.out.print("Enter the Height of cone: ");
                float Coneheight = sc.nextFloat();
                float ConeVol = (3.14f*Conerad*Conerad*(Coneheight/3));
                System.out.println("The Volume of Cone is: "+ConeVol);
                break;

            case 2: //Volume of Prism = area of base*height=l*b**h
                System.out.print("Enter the Length of Prism: ");
                float Prilength = sc.nextFloat();    
                System.out.print("Enter the base of Prism: ");
                float Pribase = sc.nextFloat();
                System.out.print("Enter the Height of Prism: ");
                float Priheight = sc.nextFloat();
                float PriVol = (Pribase*Prilength*Priheight);
                System.out.println("The Volume of Prism is: "+PriVol);
                break;

            case 3: //Volume of Cylinder = pie*r*r*h
                System.out.print("Enter the radius of Cylinder: ");
                float Cylrad = sc.nextFloat();
                System.out.print("Enter the Height of Cylinder: ");
                float Cylheight = sc.nextFloat();
                float CylVol = (3.14f*Cylrad*Cylrad*Cylheight);
                System.out.println("The Volume of Cylinder is: "+CylVol);
                break;

            case 4: //Volume of Sphere = (4/3)*pie*r*r*r
                System.out.print("Enter the radius of Sphere: ");
                float Sphrad = sc.nextFloat();
                float SphVol = ((4/3)*3.14f*Sphrad*Sphrad*Sphrad);
                System.out.println("The Volume of Sphere is: "+SphVol);
                break;

            case 5: //Volume of Pyramid = (4/3)*pie*r*r*r
                System.out.print("Enter the Length of Pyramid: ");
                float Pyrlength = sc.nextFloat();    
                System.out.print("Enter the base of Pyramid: ");
                float Pyrbase = sc.nextFloat();
                System.out.print("Enter the Height of Pyramid: ");
                float Pyrheight = sc.nextFloat();
                float PyrVol = (Pyrlength*Pyrbase*Pyrheight);
                System.out.println("The Volume of Pyramid is: "+PyrVol);
                break;
                
        }
        }while(ch!=6);
        System.out.println("\nExited........\n");
    }
}

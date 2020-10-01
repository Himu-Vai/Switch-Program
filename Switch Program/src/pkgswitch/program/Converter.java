
package pkgswitch.program;

import java.util.Scanner;


public class Converter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        float f;
        System.out.println("1. Feet to meters \n2. Meter to Feet \n3. Ounces to Pounds\n4.Pounds to Ounces\n\nEnter the Number of your choise:");
        a=input.nextInt();
        System.out.println("Enter the number you want to Convert: ");
        b=input.nextInt();
        switch (a) {
            case 1:
                f=(float) ( b/3.281);
                System.out.println(f);
                break;
            case 2:
                f=(float) ( b*3.281);
                System.out.println(f);
                break;
            case 3:
                f=(float) ( b/0.0625);
                System.out.println(f);
                break;
            case 4:
                f=(float) ( b*0.0625);
                System.out.println(f);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    
}

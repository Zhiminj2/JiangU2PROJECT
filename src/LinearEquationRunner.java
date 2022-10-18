import java.util.Scanner;
import java.lang.Math;
public class LinearEquationRunner {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       //Welcomes and asks user for input and changes the string into 4 ints
       System.out.println("Welcome to the coded java Linear equation runner! \nEnter Coordinate 1: ");
       String coord1 = scan.nextLine();
       int length1 = coord1.length();
       int comma1 = coord1.indexOf(",");
       String x1string = coord1.substring(1,comma1);
       String y1string = coord1.substring(comma1+2,length1-1);
       int x1 = Integer.parseInt(x1string);
       int y1 = Integer.parseInt(y1string);

        System.out.println("Enter Coordinate 2: ");
        String coord2 = scan.nextLine();
        int length2 = coord2.length();
        int comma2 = coord2.indexOf(",");
        String x2string = coord2.substring(1,comma2);
        String y2string = coord2.substring(comma2+2,length2-1);
        int x2 = Integer.parseInt(x2string);
        int y2 = Integer.parseInt(y2string);

        //double-checks the code to see if x is equal to itself if it does then the code ends if else then code gets printed.
        if(x1 == x2){
            System.out.println("The precondition of x1 and x2 being the same is violated."+
            "\n This is a vertical line and X = "+x1);
        }
        else {
        LinearEquation line = new LinearEquation(x1,y1,x2,y2);
        System.out.println(line.lineInfo());
        System.out.println("Enter a value for x: ");
        double xValue = scan.nextDouble();
        System.out.println("The point on the line is "+line.coordinateForX(xValue));
        }
    }
}

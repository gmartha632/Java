import java.security.DrbgParameters;
import java.util.Scanner ;

public class AreaOfRectangle {

    
    public static void main(String[] args) {
        double width = 0 ;
        double height = 0 ; 
        double area = 0 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width : ");
        width = scanner.nextDouble() ;

        System.out.print("Enter Height : ");
        height = scanner.nextDouble() ;
 
        area = width * height ;

        System.out.println("Area of rectangle : " +  area  + "SqCm" );

        scanner.close();
    }
}

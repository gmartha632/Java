import java.util.Scanner ;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Name
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();

       //Age
       System.out.print("Enter Your Age: ");
       int age = scanner.nextInt();
       

       //GPA
       System.out.print("What is Your GPA: ");
       double gpa = scanner.nextDouble();

       //Student or not
       System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

       System.out.println("Hello " + name);
       System.out.println("Your are " + age +" years old");
       System.out.println("Your GPA is: " + gpa);
     
       if(isStudent){
        System.out.println("Your are enrolled as a Student"); 
       }
       else{
        System.out.println("Your not enrolled as a Student");
       }
        scanner.close();
    }
}

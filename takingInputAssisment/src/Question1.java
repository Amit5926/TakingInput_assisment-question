import java.util.Scanner;

public class Question1 {
    public static void SinglelineInput(){
        Scanner scn = new Scanner(System.in);
        String first_name = scn.next();
        String last_name = scn.next();
        int roll_number = scn.nextInt();
        String field_of_interest = scn.next();
        System.out.println("Name: " + first_name + " " + last_name);
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Field of interest: " + field_of_interest);



    }
    public static void main(String[] args) {
        SinglelineInput();
    }
}

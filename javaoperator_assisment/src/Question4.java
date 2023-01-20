import java.util.Scanner;

public class Question4 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the a value");

        int a = sc.nextInt();
        System.out.println("enter the b value");
        int b = sc.nextInt();
//        System.out.println("a value is "+a);
//        System.out.println("b value is "+b);
        if(a<50 && a<b){
            System.out.println("true");
        }
        System.out.println("false");

    }
}

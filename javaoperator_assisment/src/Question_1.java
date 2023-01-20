import java.util.Scanner;

public class Question_1 {
    public static void quest1(){
        Scanner sc  =new Scanner(System.in);
        int x;
        x= sc.nextInt();
        System.out.println((((x+8)/3)%5)*5);

    }
    public static void main(String[] args) {
quest1();
    }
}

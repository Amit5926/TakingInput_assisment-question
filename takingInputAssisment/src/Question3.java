import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int num_1,num_2,num_3;
        Scanner Input = new Scanner(System.in);
        num_1 = Input.nextInt();
        num_2 = Input.nextInt();
        num_3 = Input.nextInt();
        int totalnumber = num_1+num_2+num_3;
        int percentage = (num_1+num_2+num_3)/3;
        System.out.println("total marks:-"+totalnumber);
        System.out.println("total percentage marks:-"+percentage);

    }
}

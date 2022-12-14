import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg,m,bodyIndex;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Height In Meters : ");
        m = input.nextDouble();

        System.out.print("Enter Your Weight : ");
        kg = input.nextDouble();

        bodyIndex = kg / (m * m);
        System.out.print("Your Body Mass Index : " + bodyIndex);

    }
}
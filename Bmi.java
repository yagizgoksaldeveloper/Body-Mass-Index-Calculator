import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz. (örn: 1.80): ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz. (örn: 75.0");
        weight = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println(bmi);
    }
}

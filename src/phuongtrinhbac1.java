import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c: ");
        double c = scanner.nextDouble();

        double x = (c-b)/a;

        if (a==0){
            if (b==c){
                System.out.println("Vô số nghiệm");
            }
            else {
                System.out.println("Vô nghiệm");
            }
        }
        else {
            System.out.println("Có 1 nghiệm là "+ x);
        }
    }
}

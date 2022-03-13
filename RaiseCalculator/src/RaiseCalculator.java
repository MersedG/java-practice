import java.util.Scanner;
public class RaiseCalculator {
    public static void main(String[] args) {

        double Salary;
        double raise;
        Scanner unos = new Scanner(System.in);
        System.out.println("Please insert your salary");
        Salary = unos.nextDouble();
        System.out.println("Please insert raise");
        raise = unos.nextDouble();
        double salaryPlusRaise = Salary+raise*100;
        System.out.println(salaryPlusRaise);


    }
}

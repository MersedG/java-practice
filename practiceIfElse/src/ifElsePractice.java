import java.util.Scanner;
public class ifElsePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number");
        int number = scanner.nextInt();
        if(number % 5 == 0) {
            System.out.println("Number "+number+ "is divisible with 5");
        } else {
            System.out.println("number " +number+ "is not divisible with 5");
        }

    }
}

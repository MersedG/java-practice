import java.util.Scanner;

public class practiceRandomNumberGenerator {
    public static void main(String[] args) {
        // Random number generator
        int numberOne = (int) (Math.random() * 10);
        int numberTwo = (int) (Math.random() * 10);
        System.out.println("What is the sum of  "+numberOne+" and " +numberTwo );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert sum");
        int odgovor = scanner.nextInt();

        // Display answers
        if(odgovor == numberOne+numberTwo){
            System.out.println("Congratulations your answer is correct");
        } else {
            System.out.println("Your answer is not correct =( ");
        }



    }

}


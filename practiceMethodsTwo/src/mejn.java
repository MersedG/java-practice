public class mejn {
    public static void main(String[] args) {
        System.out.println("sum of numbers 34 and 23 is " + sum(34, 23));
        System.out.println(" sum of numbers 22 and 32 us " + sum(22, 32));
        System.out.println("higher number between 5 and 10 is " + big(5, 10));
    }

    public static double sum(double a, double b) {

        // sum of two numbers
        double sum = 0;
        sum = a + b;

        return sum;
    }

    public static int big(int a, int b) {
        int answer;
        if (a < b) {
            answer = b;
            return answer;

        } else {
            answer = a;
            return answer;
        }
    }
}




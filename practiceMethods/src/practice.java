public class practice {
    public static int sum (int a , int b){
        int result = 0;
        for (int i = a; i<=b; i++){
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        //
        System.out.println(" suma brojeva od 1 do 10 iznosi" +sum(1,10));
        System.out.println("Suma brojeva od 34 do 67 je" +sum(34,67));
        }
    }

    


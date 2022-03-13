public class Main {

    public static void main(String[] args) {

        NasThred thread1 = new NasThred();
        thread1.start();
        Thread t1 = new Thread(new NasThread1());
        t1.start();
    }
}

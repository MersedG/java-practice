public class WorkerTest {
    String name;
    double salary;
    void insrecord (String n, double r, double raise){
        name=n;
        salary=r;
        raise = salary*1.5;
    }
    void displeyinformation(){
        System.out.println(name + " "+salary);
    }

    public static void main(String[] args) {
        WorkerTest radnik1 = new WorkerTest(), radnik2 = new WorkerTest(), radnik3 = new WorkerTest();

        radnik1.insrecord("Mersed",2345, 10);
        radnik1.displeyinformation();
        radnik2.displeyinformation();
        radnik3.displeyinformation();
    }

    }


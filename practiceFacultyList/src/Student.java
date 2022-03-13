public class Student extends Main {
    int id;
    String name;
    static String fakultet = "Fakultet elektrotehnike";

    public Student(int i, String name) {


    }

    void insert (int id,String name){

        super.id = id;
        super.name = name;
    }
    void displey(){
        System.out.println(id + " " + name + " " + fakultet );
    }

}

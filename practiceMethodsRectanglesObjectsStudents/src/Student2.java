public class Student2 {
    int id;
    String name;

    void insert(int a, String b){
        id=a;
        name=b;
    }



    void displey(){
        System.out.println(+id+" " + name);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.insert(1234,"Muke");
        s2.insert(3424,"Ado");
        s1.displey();
        s2.displey();
    }
}

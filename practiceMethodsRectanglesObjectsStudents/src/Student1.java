public class Student1 {
    int id;
    String name;
    void displeyinf(){
        System.out.println(+id+ " " +name);

    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.id = 1234;
        s1.name= "Muke";
        s1.displeyinf();
        s2.id = 234;
        s2.name= "Ado";
        s2.displeyinf();
    }
}

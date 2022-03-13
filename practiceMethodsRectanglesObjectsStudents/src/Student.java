public class Student {
    int id ;
    String name;
    void insterRecord(int id , String name ){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        int id = 324;
        String name = "Muke";
        System.out.println("Index number of student " +name+" is " +id);
    }
}

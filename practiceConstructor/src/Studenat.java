public class Studenat {
    int id;
    String name;
    int age;

    void add(int id,String name){
        this.id=id;
        this.name=name;
    }
    void add(int a ,String b ,int c){
        this.id=a;
        this.name=b;
        this.age=c;

    }
    void displej(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Studenat s1 = new Studenat();
        Studenat s2 = new Studenat();
        s1.add(123,"Muke");
        s2.add(122,"Merso", 25);
        s1.displej();
        s2.displej();
    }
}

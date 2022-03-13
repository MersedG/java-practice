public class Student1 {
    static int id;
    static String name;
    static int lenght;
    static int width;

    public void inster (int lenght, int width){
        this.lenght=lenght;
        this.width=width;
    }

    static void calculateArea(){
        System.out.println(lenght*width);
    }

    public void instertrecord(int id, String name){
        this.id = id;
        this.name = name;
    }
    static void displeyinformations(){
        System.out.println(id+name);
    }

    public static void main(String[] args){
   Student1 s1 = new Student1();
   s1.instertrecord(1234 , "Mersed Grbic");
   s1.displeyinformations();

    }


}

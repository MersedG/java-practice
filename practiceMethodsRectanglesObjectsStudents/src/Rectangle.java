public class Rectangle {
    int lenght;
    int width;
    void calculateArea(){
        System.out.println(lenght*width);

    }
    void insert(int lenght , int width){
        this.lenght = lenght;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.insert(23,24);
        r1.calculateArea();
    }
}

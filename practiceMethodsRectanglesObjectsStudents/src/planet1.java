public class planet1 {
    String name;
    int number;
    void insertRecord(String n , int b){
        this.name=n;
        this.number=b;


    }
    void displeyInfo(){
        System.out.println(name+" " +number);
    }

    public static void main(String[] args) {
        planet1 planet = new planet1();
        planet.insertRecord("Zemlja",6370);
        planet.displeyInfo();
    }
}

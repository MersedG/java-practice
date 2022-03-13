class student2 {
    int id; // identification number of a student

    String name; // Real name of a student

    void instertrecord(int id , String name) {
         this.name = name;
         this.id= id;
    }
    void displeyRecord(){
        System.out.println("Student id is "+id+" Student name is: "+name);
    }
    public static void main(String[] args) {
        student2 st1 = new student2();
        st1.instertrecord(12334 ,"Mersed" );
        st1.displeyRecord();
    }
}

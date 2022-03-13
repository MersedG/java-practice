public class Main {

    public static void main(String[] args) {

        Print<String> printStringList = new Print<>();
        printStringList.add("Midheta");
        printStringList.add("Eldar");
        printStringList.add("Adnan");
        printStringList.add("Mersed");
        printStringList.add("Amir");


        printStringList.print();
        Print<Book> printBookList = new Print<>();
        printBookList.add(new Book("Robinson Kruso","Daniel Deffo"));
        printBookList.add(new Book("Zlocin i kazna","Fjodor Dostojevski"));
        printBookList.print();
                            

    }
}

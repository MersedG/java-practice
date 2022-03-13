import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray = {1 , 2 , 3, 4, 5,};
        Double[] doubleArray= {1.1, 2.2, 3.3, 4.4};
        Character[] charArray ={'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains: ");
        printArray(intArray);

       System.out.println("\nArray doubleArray contains");
       printArray(doubleArray);
        System.out.println("\nArray characterArray contains");
       printArray(charArray);
       Box<Integer> integerBox = new Box<Integer>();
       Box<String> stringBox = new Box<String>();

       integerBox.add(10);
       stringBox.add(new String("Hello World"));
        System.out.printf("Integer Value  %d\n\n", integerBox.get());
        System.out.printf("String value >%s\n" , stringBox.get());


    }
    public static <E> void printArray ( E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();

    }

}

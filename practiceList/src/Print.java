import java.util.ArrayList;

public class Print<T>{
    ArrayList<T> list = new ArrayList<>();

    public void add(T element){
        if (!list.contains(element)){
            list.add(element);
        }

    }

    public  void print(){
        for (T elem : list) {
            System.out.println(elem);
        }

    }
}

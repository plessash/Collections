import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> test = new MyArrayList<Integer>();

        test.addElement(4);
        test.addElement(1);
        test.addElement(7);
        test.addElement(9);
        test.addElement(3);

        test.remove(1);

        MyArrayList<Integer> test2 = new MyArrayList<Integer>();

        test2.addElement(9345534);
        test2.addElement(7);
        test.addAll(test2);

        test.removeAll();
        test.printDisplay();
    }
}

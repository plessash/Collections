import java.util.Comparator;
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

        test2.addElement(934);
        test2.addElement(543);
        test2.addElement(234);
        test2.addElement(11);
        test2.addElement(45);
        test2.addElement(3);
        test.addAll(test2);

        Comparator<Integer> intComparator = Integer::compareTo;
        test.bubbleSort(intComparator);

        //test.removeAll();
        test.printDisplay();
       // test.bubleSort((o1, o2) -> o1.intValue());

    }
}

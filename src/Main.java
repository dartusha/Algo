import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Array<Integer> array = new ArrayImpl<>();
        array.add(2);
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(3);

        System.out.println(array);
        array.sortBubble();
        array.sortSelect();
        array.sortInsert();
        System.nanoTime();
      //  TimeUnit.NANOSECONDS.toMilSSis();
        System.out.println(array);

    }


}

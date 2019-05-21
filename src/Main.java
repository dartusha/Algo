import java.util.concurrent.TimeUnit;

public class Main {

    public static void fillSort(){
        Array<Double> array = new ArrayImpl<>();
        long tmp=0;
        long startTime = System.nanoTime();
        for (int i = 0; i < ArrayImpl.INITIAL_CAPACITY; i++) {
            array.add(Math.random()*ArrayImpl.INITIAL_CAPACITY);
        }
        System.out.printf("Вставка выполнена за %f секунд \n",(double)(System.nanoTime()-startTime)/ 1000000000);
        startTime = System.nanoTime();
        array.sortBubble();
        System.out.printf("Сортировка пузырьком выполнена за %f секунд\n",(double)(System.nanoTime()-startTime)/ 1000000000);
        startTime = System.nanoTime();
        array.sortSelect();
        System.out.printf("Сортировка выбором выполнена за %f секунд \n",(double)(System.nanoTime()-startTime)/ 1000000000);
        startTime = System.nanoTime();
        array.sortInsert();
        System.out.printf("Сортировка вставками выполнена за %f секунд \n",(double)(System.nanoTime()-startTime)/ 1000000000);
    }

    public static void main(String[] args) {
        fillSort();
    }


}

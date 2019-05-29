package Lesson4;

public interface QueueNew<E> {

    void insert(E value);

    E remove();

    E peek();

    boolean isEmpty();
    boolean isFull();

    int getSize();

}
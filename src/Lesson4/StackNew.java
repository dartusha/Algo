package Lesson4;

public interface StackNew<E> {

    void push(E value);

    E pop();

    E peek();

    boolean isEmpty();
    boolean isFull();

    int getSize();

    void clear();

}
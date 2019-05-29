package Lesson3;

//3. Создать класс для реализации дека
public class Deque {
    private int maxSize;
    private int[] deque;
    private int front;
    private int rear;
    private int items;

    private void addItems(){
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("Lesson3.Deque переполнен");
        else
            items++;

    }

    private void removeItems(){
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Lesson3.Deque пуст");
        else
            items--;
    }

    public Deque(int s){
        maxSize = s;
        deque = new int[maxSize];
        front=-1;
        rear=-1;
    }

    public void insertLeft(int i){
        if (rear==maxSize-1) rear=-1;
        if (front==-1) front=0;
        addItems();
        deque[++rear] = i;
    }

    public void insertRight(int i){
        if (rear==-1) rear=maxSize;
        if (front<=0) front=maxSize;
        addItems();
        deque[--front] = i;
    }

    public int removeRight() {
        int temp = deque[front++];
        if (front == maxSize)
            front = 0;
        removeItems();
        return temp;
    }

    public int removeLeft() {
        int temp = deque[rear--];
        if (rear<0)
            rear=maxSize-1;
        removeItems();
        return temp;
    }


    public int peekFront(){
        if (front==-1) front++;
        if (front==maxSize) front--;
        return deque[front];
    }
    public int peekRear(){
        if (rear==maxSize) rear--;
        if (rear==-1) rear++;
        return deque[rear];
    }

    public boolean isEmpty(){
        return (items==0);
    }

    public boolean isFull(){
        return (items==maxSize);
    }

    public int size(){
        return items;
    }
}

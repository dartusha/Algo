public class Deque {
    private int maxSize;
    private int[] deque;
    private int front;
    private int rear;
    private int items;

    private void addItems(){
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("Deque переполнен");
        else
            items++;

    }

    private void removeItems(){
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Deque пуст");
        else
            items--;
    }

    public Deque(int s){
        maxSize = s;
        deque = new int[maxSize];
        front = -1;
        rear = -1;
        items = 0;
    }


    public void insertLeft(int i){
        addItems();
        if(rear==-1)
            rear = maxSize;
        deque[--rear] = i;
    }

    public void insertRight(int i){
        addItems();
        if(front == maxSize-1)
            front = -1;
        deque[++front] = i;
    }

/*
    public int removeRight() {
        int temp = deque[front++];
        if (front == maxSize)
            front = 0;
        removeItems();
        return temp;
    }
    */
    public int removeRight() {
    int temp = deque[front--];
    if (front == -1)
            front = maxSize-1;
    removeItems();
    return temp;
}

    public int removeLeft(){
        int temp = deque[rear++];
        if (rear == maxSize)
            rear=0;
        removeItems();
        return temp;
    }
/*
    public int removeLeft(){
        int temp = deque[rear--];
        if(rear == -1)
            rear=maxSize-1;
        removeItems();
        return temp;
    }
    */

    public int peekFront(){
        if (front==-1) front++;
        return deque[front];
    }
    public int peekRear(){
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

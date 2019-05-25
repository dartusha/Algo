public class Deque {
    private int maxSize;
    private int[] deque;
    private int front,back;
    private int rear;
    private int items;

    public Deque(int s){
        maxSize = s;
        deque = new int[maxSize];
        front = 0;
        back=0;
        rear= -1;
        items = 0;
    }
    public void insertLeft(int i){
        if(rear == maxSize-1)
            rear = -1;
        deque [++rear] = i;
        items++;
    }

    public int removeLeft(){
        int temp = deque [front++];
        if(front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public void insertRight(int i){
        if(rear == -1)
            rear = maxSize-1;
        deque [rear++] = i;
        items++;
    }

    public int removeRight(){
        int temp = deque [back--];
        if(back == -1)
            back = 0;
        items--;
        return temp;
    }

    public int peek(){
        return deque[front];
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

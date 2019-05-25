public class Main{
    public static void main(String[] args){
/*
        Deque q = new Deque(5);
        q.insertLeft(10);
        q.insertLeft(20);
        q.insertLeft(30);
        q.insertLeft(40);
        q.insertLeft(50);
        q.removeRight();
        q.removeRight();

        q.insertLeft(50);
        q.insertLeft(60);
        q.insertLeft(70);
        q.insertLeft(80);
        while( !q.isEmpty() ){
            int n = q.removeRight();
            System.out.println(n);

        }
        */

        Deque q1 = new Deque(5);
        q1.insertLeft(10);
        q1.insertLeft(20);
     //   q1.insertLeft(30);
     //   q1.insertLeft(40);
      //  q1.insertLeft(50);
      //  q1.removeLeft();
       q1.removeLeft();

        q1.insertLeft(50);
     //   q1.insertRight(60);
      //  q1.insertRight(70);
      //  q1.insertRight(80);
        while( !q1.isEmpty() ){
            int n = q1.removeLeft();
            System.out.println(n);

        }

/*
        Queue q1 = new Queue(5);
        q1.insert(10);
        q1.insert(20);
        q1.insert(30);
        q1.insert(40);
        q1.insert(50);
        q1.remove();
        q1.remove();

        q1.insert(50);
        q1.insert(60);
        q1.insert(70);
        q1.insert(80);
        while( !q1.isEmpty() ){
            int n = q1.remove();
            System.out.println(n);

        }*/
    }
}

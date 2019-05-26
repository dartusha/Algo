import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void task1(){
        System.out.println("Введите строку:");
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        try {
            String str=buf.readLine();
            System.out.printf("Введена строка %s \n",str);
            Stack s=new Stack(str.length());
            char[] ch=str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                s.push(ch[i]);
            }
            for (int i = 0; i < str.length(); i++) {
                System.out.print((char)s.peek());
                s.pop();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
      //  task1();

        Deque q = new Deque(5);
        q.insertLeft(10);
        q.insertLeft(20);
        q.insertLeft(30);
        q.insertLeft(40);
        q.insertLeft(50);
        System.out.println(q.peekRear());
        System.out.println(q.peekFront());
     //   q.insertLeft(30);

     //   q.removeRight();
      //  q.removeRight();

     //   q.insertLeft(40);
    //    q.insertLeft(50);
      //  q.insertLeft(60);
     //   q.insertLeft(70);
     //   q.insertLeft(80);
        while( !q.isEmpty() ){
            int n = q.removeLeft();
            System.out.println(n);

        }

    }
}

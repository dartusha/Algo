package Lesson3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
   //2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
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
        task1();

        Deque q = new Deque(5);
        q.insertRight(10);
        q.insertRight(20);
        q.insertRight(30);
        q.insertRight(40);
        q.insertRight(50);
        System.out.println(q.peekRear());
        System.out.println(q.peekFront());

        while( !q.isEmpty() ){
            int n = q.removeRight();
            System.out.println(n);

        }

    }
}

package Lesson4;

/*
Задание 2. В методе main Lesson4.LinkIteratorApp проверить все методы итератора.
 */
public class LinkIteratorApp {


    public static void main(String[] args) {
        LinkedIteratorList list = new LinkedIteratorList();

        LinkInterator itr = new LinkInterator(list);

        if (list.isEmpty()) System.out.println("Список пуст");

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);

        LinkInterator  iterator = list.getIterator();
        iterator.nextLink();
        Link link=iterator.getCurrent();
        list.setFirst(link);

        list.display();

    }

}


public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("LinkedList");
        System.out.println();
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(23);
        list.insertFirst(74);
        list.insertFirst(37);
        list.insertFirst(33);
        list.insert(100, 2);
        list.insertLast(99);
        list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

        System.out.println();
        System.out.println("DoublyLinkedList");
        System.out.println();

        DoublyLinkedList listDD = new DoublyLinkedList();
        listDD.insertFirst(3);
        listDD.insertFirst(4);
        listDD.insertFirst(23);
        listDD.insertFirst(74);
        listDD.insertFirst(37);
        listDD.insertFirst(33);
        listDD.display();
        listDD.insertLast(99);
        listDD.display();
        listDD.insertafter(74, 343);
        listDD.display();

        System.out.println();
        System.out.println("CircularLinkedList");
        System.out.println();

        CircularLinkedList listCR = new CircularLinkedList();
        listCR.insert(3);
        listCR.insert(4);
        listCR.insert(23);
        listCR.insert(74);
        listCR.insert(37);
        listCR.insert(33);
        listCR.display();
        listCR.delete(33);
        listCR.display();
    }
}

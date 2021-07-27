public class Main {
    public static void main(String[] args){
        Linky list = new Linky();
        list.insert(5);
        list.insert(7);
        list.show();
        System.out.println("\n");
        list.instertAtStart(3);
        list.show();
        System.out.println("\n");
        list.instertAt(1,10);
        list.show();
        System.out.println("\n");
        list.deleteFrom(1);
        list.show();
        System.out.println("\n");
        System.out.println("double linked list");
        DLinky dlist = new DLinky();
        dlist.insert(1);
        dlist.insert(2);
        dlist.show();
        System.out.println("\n");
        dlist.insertAtStart(0);
        dlist.show();
        System.out.println("\n");
        dlist.insertAt(1,10);
        dlist.show();
        System.out.println("\n");
        dlist.deleteFrom(1);
        dlist.show();
    }
}

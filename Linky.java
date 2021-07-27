public class Linky {
    Node head;

    public void insert(int data){
         Node node = new Node();
         node.data = data;
         node.next = null;

         if(head==null){
             head = node;
         }else{
             Node n = head;
             while(n.next != null){
                 n = n.next;
             }
             n.next = node;
         }
    }
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void instertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        System.out.println(head.data + "is the head");
    }
    public void instertAt(int index, int data){
        Node node = new Node();
        node.data = data;

        if(index == 0){
            instertAtStart(data);
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    //note: the list starts from the index 0
    public void deleteFrom(int index){
       if(index == 0){
           head = head.next;

       }else{
           Node n = head;
           Node n1 = null;
           for (int i = 0; i < index - 1; i++) {
               n = n.next;
           }
           n1 = n.next;
           n.next = n1.next;
           System.out.println("deleted data is " + n1.data);
           n1 = null;
       }

    }

}

public class DLinky {
    DNode head;


    public void insert(int data) {
        DNode node = new DNode();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            DNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.back = n;
        }

    }


    public void show() {
        DNode n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }


    public void insertAtStart(int data) {
        DNode n = new DNode();
        n.data = data;
        head.back = n;
        n.next = head;
        head = n;
    }

    public void insertAt(int index, int data) {
        DNode node = new DNode();
        node.data = data;

        if (index == 0) {
            insertAtStart(data);
        } else {
            DNode toReplace = head;
            for (int i = 0; i <= index; i++) {
                toReplace = toReplace.next;
            }

            // odamutat
            node.next = toReplace;
            //visszamutat az előzőre
            node.back = toReplace.back;
            //rámutat balról
            toReplace.back.next = node;
            //rámutat jobbról
            toReplace.back = node;
        }
    }

    public void deleteFrom(int index) {
        if (head == null) {
            return;
        }
        DNode n = head;

        for (int i = 0; i < index; i++) {
            if (n.next == null) {
                return;
            }
            n = n.next;
        }
        if(n.back != null) {
            n.back.next = n.next;
        }else if(n.next != null){
            head = n.next;
        }else{
            head = null;
        }
        if(n.next != null) {
            n.next.back = n.back;
        }
        System.out.println("deleted data is " + n.data);

    }


}

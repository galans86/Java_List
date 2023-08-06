public class List {
    Node head;
    Node tail;

    public void add(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail  = currentNode;
            }
            if (next == null){
               head = currentNode;
            }
            currentNode = next;
        }
    }

     public String toString(){
         String str = "";
         Node currentNode = head;
         while (currentNode != null) {
             str = str + currentNode.value + " ";
             currentNode = currentNode.next;
         }
         return str;
     }
    public class Node {
        private int value;
        public Node next;
        public Node previous;

        public Node(int value) {
            this.value = value;
        }
    }
}

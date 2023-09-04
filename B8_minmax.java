public class minmax {
    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head, tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public int minimumNode() {
        Node current = head;
        int min,max;

        if (head == null) {
            System.out.println("List is empty");
            return 0;
        } else {
            min = head.data;
            max= head.data;
            while (current != null) {
                if (min > current.data)
                {
                    min = current.data;
                }
                if(max<current.data)
                {
                	max=current.data;
                }
                current = current.next;
            }
        }
        System.out.println("Minimum value node in the list: " + min);
        System.out.println("Maximum value node in the list: " + max);
        return 0;
       
    }

    public static void main(String[] args) {

        minmax dList = new minmax();

        dList.addNode(5);
        dList.addNode(7);
        dList.addNode(9);
        dList.addNode(1);
        dList.addNode(2);
        dList.minimumNode();

    }
}
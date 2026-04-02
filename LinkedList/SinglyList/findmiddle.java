class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class findmiddle{
    static Node head = null;

     static void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    static void middle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle: "+ slow.data);
    }

     static void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertAtBeginning(10);
        insertAtBeginning(20);
        insertAtBeginning(30);
        insertAtBeginning(40);
        insertAtBeginning(50);

        printlist();

        middle();
    }
}
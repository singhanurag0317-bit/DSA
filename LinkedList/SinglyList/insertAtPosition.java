class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class insertAtPosition{
    static Node head = null;

    static void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtPosition(int value, int pos){
        Node newNode = new Node(value);
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i =0;i<pos-1;i++){
            if(temp==null){
                System.out.println("position out of bounds");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void reverseList(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        insertAtBeginning(10);
        insertAtBeginning(20);
        insertAtBeginning(30);
        insertAtBeginning(40);

        printlist();

        insertAtPosition(99, 2);

        printlist();

        reverseList();

        printlist();
    }
}
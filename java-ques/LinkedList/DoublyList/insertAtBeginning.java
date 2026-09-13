class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public class insertAtBeginning{
        static Node head = null;

        static void insertAtBeginning(int value){
            Node newNode = new Node(value);

            if(head != null){
                head.prev = newNode;
                newNode.next = head;

            }
            head = newNode;
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
            printlist();

        }
    }
}
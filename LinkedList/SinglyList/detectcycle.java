class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class detectcycle{
    static Node head = null;

     static void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

   

    static boolean  detectcycle(){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            
            if(fast==slow){
                return true;
            }
        }
        return false;
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
        boolean result = detectcycle();
        System.out.println("cycle detected: " + result);
       
    }
}

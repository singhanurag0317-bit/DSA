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

    static void insertAtPosition(int value, int pos){
        Node newNode = new Node(value);

        if(pos ==0){
            newNode.next = head;
            head  = newNode;
            return;
        }
        Node temp = head;
        for(int i =0; i<pos-1;i++){
            if(temp==null){
                System.out.print("invalid position");
                return;

            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
}
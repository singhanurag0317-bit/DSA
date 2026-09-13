class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    
    }
}


public class task1{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

        int count = 0;
        temp = head;
        while(temp!=null){
        count++;
        temp = temp.next;
        }
        System.out.println(count);
    }
}
    

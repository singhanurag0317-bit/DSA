class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class task2 {
  static Node head = null;
  
  static void insertAtBeginning(int value){
  Node newNode = new Node(value);
  newNode.next = head;
  head = newNode;
}

static void insertAtEnd(int value){
Node newNode = new Node(value);
if(head == null){
    head = newNode;
}
else{
    Node temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    temp.next=newNode;
}
}

static void deletefrombeginning(){
    if(head == null){
        System.out.println("list is empty");
        return;
    }
    head = head.next;
}

static void deletefromend(){
    if(head == null){
        System.out.println("list is empty");
        return;
    }
    if(head.next==null){
        head = null;
        return;
    }
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    temp.next = null;
}

static void printlist(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+ " ");
        temp = temp.next;
    }
    System.out.println();
}
public static void main(String[] args) {
    insertAtBeginning(20);
    insertAtBeginning(10);
    insertAtEnd(30);
    insertAtEnd(40);

    printlist();

    deletefrombeginning();
    deletefromend();

    printlist();
}
}
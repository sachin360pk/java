public class CircularSinglyLinkedList {
    static class Node{
        int value;
        Node next;
   }
   Node head;
   Node tail;
   int size;
   public Node createCircularSinglyLL(int nodevalue){
       head=new Node();
       Node node=new Node();
       node.next=node;
       node.value=nodevalue;
       head=node;
       tail=node;
       size=1;
       return head;
   }
   public void insertion(int nodevalue,int loc){
    Node newnode=new Node();
    newnode.value=nodevalue;
    if(head==null){
        createCircularSinglyLL(nodevalue);
        return;
    }
    if(loc==0){
        newnode.next=head;
        head=newnode;
        tail.next=newnode;

    }
    else if(loc>=size){
        newnode.next=head;
        tail.next=newnode;
        tail=newnode;
    }
    else{
        Node prevnode=head;
        for(int i=0;i<loc-1;i++){
            prevnode=prevnode.next;
        }
        Node nextnode=prevnode.next;
        prevnode.next=newnode;
        newnode.next=nextnode;
    }
    size++;
}
public void traversal(){
    if(head==null){
        System.out.println(" circular Singly Linked List does not exist");
    }
    else{
        Node tempnode=head;
        for(int i=0;i<size;i++){
            System.out.print(tempnode.value);
            if(i!=size-1){
                System.out.print("-->");
            }
            tempnode=tempnode.next;
        }
    }
    System.out.println();
}
public boolean searchNode(int nodevalue){
    if(head!=null){
        Node tempnode=head;
        for(int i=0;i<size;i++){
            if(tempnode.value==nodevalue){
                System.out.println("value "+nodevalue+" found at "+i+" index");
                return true;
            }
            tempnode=tempnode.next;
        }
    }
    System.out.println("value not found");
    return false;
}
public void deletion(int loc){
    if(head==null){
        System.out.println("singly linked list does not exist");
        return;
    }
    else if(loc==0){
        if(size>1){
            head=head.next;
            tail.next=head;
            size--;
        }
        else{
           tail=null;
           head.next=null; 
           head=null;
        }
    }
    else if(loc>=size){
        Node tempnode=head;
        for(int i=0;i<size-1;i++){
            tempnode=tempnode.next;
        }
        if(tempnode==head){
            head=null;
            tail=null;
            size--;
            return;
        }
        tempnode.next=head;
        tail=tempnode;
        size--;
    }
    else{
        Node tempnode=head;
        for(int i=0;i<loc-1;i++){
            tempnode=tempnode.next;
        }
        tempnode.next=tempnode.next.next;
        size--;
    }

}
public void deleteCSLL(){
    head=null;
    tail=null;
    tail.next=null;
    System.out.println("CSLL successfully deleted!");
}
   public static void main(String[] args) {
    CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
       csll.createCircularSinglyLL(3);
    //    System.out.println(csll.head.value);
       csll.insertion(4,1);
       csll.insertion(5,2);
       csll.insertion(6,3);
       csll.insertion(7,4);
       csll.insertion(8,5);
       csll.insertion(9,6);
       csll.traversal();
       csll.searchNode(7);
    //    System.out.println(csll.size);
       csll.deletion(0);
    //    csll.deleteCSLL();
       csll.traversal();
   }
}

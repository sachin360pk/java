// package Linked List;

public class SinglyLinkedList {
    static class Node{
         int value;
         Node next;
    }
    Node head;
    Node tail;
    int size;
    public Node createSinglyLL(int nodevalue){
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodevalue;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insertInLinkedList(int nodevalue,int loc){
        Node newnode=new Node();
        newnode.value=nodevalue;
        if(head==null){
            createSinglyLL(nodevalue);
            return;
        }
        if(loc==0){
            newnode.next=head;
            head=newnode;

        }
        else if(loc>=size){
            newnode.next=null;
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
            System.out.println("Singly Linked List does not exist");
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
            head=head.next;
            size--;
            if(size==1);{
               tail=null; 
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
            tempnode.next=null;
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
    public void deleteSLL(){
        head=null;
        tail=null;
        System.out.println("SLL successfully delete!");
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.createSinglyLL(3);
        // System.out.println(sll.head.value);
        sll.insertInLinkedList(4,0);
        sll.insertInLinkedList(5,1);
        sll.insertInLinkedList(6,2);
        sll.insertInLinkedList(7,3);
        sll.insertInLinkedList(8,4);
        sll.traversal();
        sll.searchNode(8);
        sll.deletion(5);
        sll.traversal();
        sll.deleteSLL();
        sll.traversal();
    }
}

public class DoublyLinkedList {
    public class Node{
        int value;
        Node next;
        Node prev;
    }
    Node head;
    Node tail;
    int size;
    public Node createDoublyLL(int nodevalue){
        head=new Node();
        Node node=new Node();
        node.value=nodevalue;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insertion(int nodevalue,int loc){
        Node newnode=new Node();
        newnode.value=nodevalue;
        if(head==null){
            createDoublyLL(nodevalue);
            return;
        }
        if(loc==0){
            newnode.prev=null;
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        else if(loc>=size){
            newnode.prev=tail;
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
            newnode.prev=prevnode;
            newnode.next=nextnode;
            nextnode.prev=newnode;
        }
        size++;
    }
    public void traverse(){
        if(head!=null){
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("-->");
                }
                tempNode=tempNode.next;
            }
        }else{
            System.out.println("The DLL does not exist!");
        }
        System.out.println();
    }
    public void reverseTraverse(){
        if(head!=null){
            Node tempNode=tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("<--");
                }
                tempNode=tempNode.prev;
            }
        }
        else{
            System.out.print("DLL does not exist");
        }
        System.out.println();
        
    }
    public boolean search(int nodeValue){
        if(head!=null){
            Node tempnode=head;
            for(int i=0;i<size;i++){
                if(tempnode.value==nodeValue){
                    System.out.print("The node fount at location"+i);
                    return true;
                }
                tempnode=tempnode.next;
            }
        }else{
            System.out.print("node not found");
        }
        return false;
    }
    public void delete(int loc){
        if(head==null){
            System.out.print("The DLL does not exist");
            return;
        }
        else if(loc==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }else{
                head=head.next;
                head.prev=null;
                size--;
            }
        }else if(loc>=size){
            Node tempnode=tail.prev;
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }else{
                tempnode.next=null;
                tail=tempnode;
                size--;
            }
        }else{
            Node tempnode=head;
            for(int i=0;i<loc-1;i++){
                tempnode=tempnode.next;
            }
            tempnode.next=tempnode.next.next;
            tempnode.next.prev=tempnode;
            size--;
        }
    }
    public void deleteDLL(){
        Node tempnode=head;
        for(int i=0;i<size;i++){
            tempnode.prev=null;
            tempnode=tempnode.next;
        }
        head=null;
        tail=null;
        System.out.print("The DLL has been deleted");
    }
    public static void main(String[] args) {
        DoublyLinkedList DLL=new DoublyLinkedList();
        DLL.createDoublyLL(1);
        System.out.println(DLL.head.value);
        DLL.insertion(2,1);
        DLL.insertion(3,2);
        DLL.insertion(4,3);
        DLL.insertion(5,4);
        DLL.insertion(6,5);
        DLL.insertion(7,6);
        DLL.insertion(8,7);
        DLL.insertion(9,8);
        DLL.insertion(10,9);
        DLL.traverse();
        DLL.reverseTraverse();
        DLL.search(4);
        DLL.delete(4);
        DLL.deleteDLL();
        DLL.traverse();

    }
}

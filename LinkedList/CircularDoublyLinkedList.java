public class CircularDoublyLinkedList {
    public class Node{
        int value;
        Node next;
        Node prev;
    }
    Node head;
    Node tail;
    int size;
    public Node createCircularDoublyLL(int nodevalue){
        head=new Node();
        Node node=new Node();
        node.value=nodevalue;
        node.next=node;
        node.prev=node;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insert(int nodeValue, int loc) {
        Node newnode = new Node();
        newnode.value = nodeValue;
        if (head == null) {
            createCircularDoublyLL(nodeValue);
            return;
        } else if (loc == 0) {
            newnode.next = head;
            newnode.prev = tail;
            head.prev = newnode;
            tail.next = newnode;
            head = newnode;
        } else if (loc >= size) {
            newnode.next = head;
            newnode.prev = tail;
            head.prev = newnode;
            tail.next = newnode;
            tail = newnode;
        } else {
            Node tempNode = head;
            for (int i = 0; i < loc - 1; i++) {
                tempNode = tempNode.next;
            }
            newnode.prev = tempNode;
            newnode.next = tempNode.next;
            tempNode.next = newnode;
            newnode.next.prev = newnode;
        }
        size++;
    }

    public void traverse() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL does not exist!");
        }
        System.out.println();
    }

    public void reverseTraverse() {
        if (head != null) {
            Node tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.print("DLL does not exist");
        }
        System.out.println();

    }

    public boolean search(int nodeValue) {
        if (head != null) {
            Node tempnode = head;
            for (int i = 0; i < size; i++) {
                if (tempnode.value == nodeValue) {
                    System.out.print("The node fount at location" + i);
                    return true;
                }
                tempnode = tempnode.next;
            }
        } else {
            System.out.print("node not found");
        }
        return false;
    }

    public void delete(int loc) {
        if (head == null) {
            System.out.print("The DLL does not exist");
        } else if (loc == 0) {
            if (size == 1) {
                head.prev = null;
                tail.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (loc >= size) {
            if (size == 1) {
                head.prev = null;
                tail.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            Node tempnode = head;
            for (int i = 0; i < loc-1; i++) {
                tempnode = tempnode.next;
            }
            tempnode.next = tempnode.next.next;
            tempnode.next.prev = tempnode;
            size--;
        }
    }

    public void deleteDLL() {
        Node tempnode = head;
        for (int i = 0; i < size; i++) {
            tempnode.prev = null;
            tempnode = tempnode.next;
        }
        head = null;
        tail = null;
        System.out.print("The CDLL has been deleted");
    }
    public static void main(String[] args) {
        CircularDoublyLinkedList CDLL=new CircularDoublyLinkedList();
        CDLL.createCircularDoublyLL(7);
        System.out.println(CDLL.head.value);
    }
}

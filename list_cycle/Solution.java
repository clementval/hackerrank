/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node p1 = head; // pointer 1 goes at speed 1x
    Node p2 = head; // pointer 2 goes at speed 2x
    
    while(p1 != null && p2 != null){
        p1 = p1.next;
        if(p2.next != null){
            p2 = p2.next.next;
        } else { 
            p2 = null;
        }
        if(p1 != null && p2 != null && p1 == p2){
            return true;
        }
    }
    return false;
}

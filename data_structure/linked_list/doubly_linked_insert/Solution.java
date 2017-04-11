/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    Node inserted = new Node();
    inserted.data = data;
    if(head == null){
        return inserted;
    } else if (data <= head.data) {
        inserted.next = head;
        head.prev = inserted;
        return inserted;
    } else {
        Node rest = SortedInsert(head.next, data);
        head.next = rest;
        rest.prev = head;
        return head;
    }
}


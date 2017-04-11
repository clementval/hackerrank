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

Node Reverse(Node head) {
    
    Node tmp = head;
    Node ptr = head;
    while (tmp != null) {
        Node prev = tmp.prev;
        tmp.prev = tmp.next;
        tmp.next = prev;
        ptr = tmp;
        tmp = tmp.prev;
    }
    return ptr;
}



/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head == null){
        return null;
    }
    
    Node prev = head;
    Node crt = head.next;
    while(crt != null){
        if(prev.data == crt.data){
            crt = crt.next;
            prev.next = crt;
        } else {
            prev = crt;
            crt = crt.next;
        }
    }

    return head;
}



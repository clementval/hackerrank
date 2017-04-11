/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    Node currentA = headA;
    Node currentB = headB;
    
    while(currentA != currentB){
        if(currentA == null){
            currentA = headB;
        } else {
            currentA = currentA.next;
        }
        
        if(currentB == null){
            currentB = headA;
        } else {
            currentB = currentB.next;
        }
    }
    return currentA.data;
}



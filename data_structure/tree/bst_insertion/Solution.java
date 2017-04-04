 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
{
    Node inserted = new Node();
    inserted.data = value;
    Node crt = root;
    if(root == null){
        return inserted;
    }
    boolean notInserted = true;
    while(notInserted){
        if(value > crt.data){
            if(crt.right != null){
                crt = crt.right;
            } else {
                crt.right = inserted;
                notInserted = false;
            }
        } else {
            if(crt.left != null){
                crt = crt.left;
            } else {
                crt.left = inserted;
                notInserted = false;
            }
        }
    }
    return root;
}


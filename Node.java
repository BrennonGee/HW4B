package project6;



public class Node implements Position {

    private Object key;
    private Node leftChild, rightChild, parent;

       
    public Node() {
    }
    
    public Node (Object newKey, Node newParent, Node newRightChild,
                   Node newLeftChild) {
        key = newKey;
        parent = newParent;
        rightChild = newRightChild;
        leftChild = newLeftChild;
    }


    public Object key () {
        return key;
    }
    
 
    public void setKey (Object newKey) {
        key = newKey;
    }

    public Node getParent () {
        return parent;
    }
   
    public void setParent (Node newParent) {
        parent = newParent;
    }
    
    public Node getLeftChild () {
        return leftChild;
    }
    
    public void setLeftChild (Node newLeftChild) {
        leftChild = newLeftChild;
    }
    
    public Node getrightChild () {
        return rightChild;
    }

    public void setRightChild (Node newRightChild) {
        leftChild = newRightChild;
    }

}

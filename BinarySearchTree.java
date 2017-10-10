package HW4B;

/**
 *
 * @author brennongee
 */

public class BinarySearchTree extends Node{

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void insert(BST T, Node z){
        Node y = null;
        Node x = T.root;
        
        while (x != null){
            y = x;
            if (z.key < x.Key){
                x = x.left;
            }
            else{
                x = x.right;
            }
        }
        z.p = y;
        if (y == null){
            T.root = z;
        }
        else if (z.key < y.key){
            y.left = z;
        }
        
        else {
            y.right = z;
        }
    }
    
    public void delete(BST T, node z){
        if (z.left == null){
            transplant (T, z, z.right);
        }
        else if (z.right == null){
            transplant(T, z, z.left);
        }
        
        else{
            node y = min(z.right);
            
            if (y.parent != z){
                transplant (T, y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            
            transplant(T, z, y);
            y.left = z.left;
            y.left.parent = y;
        }
    }
    
    //Finds the node with the smallest key
    public node min(node x){
        
        while (x != null){
            x = x.left;
        }
        
        return x;
    }
    
    //Finds the node with the largest key
    public node max(node x){
        
        while (x != null){
            x = x.right;
        }
        
        return x;
    }
    
    //Find the smallest key greater than x.key
    public node successor(node x){
        
        if (x.right != null){
            return min(x.right);
        }
        
        node y = x.parent;
        
        while (y != null && x == y.right){
            x = y;
            y = y.parent;
        }
        
        return y;
    }
    
    //find the largest key smaller than x.key
    public node predecessor(node x){
                if (x.right != null){
            return max(x.left);
        }
        
        node y = x.parent;
        
        while (y != null && x == y.left){
            x = y;
            y = y.parent;
        }
        
        return y;
    }
    
    //print method 
    public void printInOrder(node root){
        if(root !=  null) {
            printInOrder(root.left);
            //Visit the node by Printing the node data  
            System.out.printf("%d ",root.key);
            printInOrder(root.right);
        }
    }
    
}

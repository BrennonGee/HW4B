/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW4B;

/**
 *
 * @author brennongee
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void Insert(BST T, node z){
        node y = null;
        node x = T.root;
        
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
    
    public void Delete(){
        
    }
    
    public node Min(node x){
        
        while (x != null){
            x = x.left;
        }
        
        return x;
    }
    
    
    public node Max(node x){
        
        while (x != null){
            x = x.right;
        }
        
        return x;
    }
    
    public node Successor(node x){
        
        if (x.right != null){
            return Min(x.right);
        }
        
        node y = x.parent;
        
        while (y != null && x == y.right){
            x = y;
            y = y.parent;
        }
        
        return y;
    }
    
    public node Predecessor(node x){
                if (x.right != null){
            return Min(x.left);
        }
        
        node y = x.parent;
        
        while (y != null && x == y.left){
            x = y;
            y = y.parent;
        }
        
        return y;
    }
    
    public void PrintInOrder(node root){
        if(root !=  null) {
            PrintInOrder(root.left);
            //Visit the node by Printing the node data  
            System.out.printf("%d ",root.key);
            PrintInOrder(root.right);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencyTree;

import java.util.LinkedList;
import java.util.List;

/**
 * This is the Binary Search Tree implementation
 */
public class BinarySearchTree extends BinaryTree {

    /**
     * Constructor with root node
     * @param root root node
     */
    public BinarySearchTree(Node root) {
        super(root);
    }

    /**
     * Create a tree object without root node.
     */
    public BinarySearchTree() {
        this.setRoot(null);
    }

    @Override
    public void insert(Node newNode) {
        if (this.getRoot() == null) {
            this.setRoot(newNode);
        } else {
            this.insert2(this.getRoot(), newNode);
        }
    }

    private void insert2(Node currentNode, Node newNode) {
         
        if (((Integer)currentNode.getValue()).intValue() > ((Integer)newNode.getValue()).intValue()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                this.insert2(currentNode.getLeft(), newNode);
            }
        } else if(((Integer)currentNode.getValue()).intValue() < ((Integer)newNode.getValue()).intValue()) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                this.insert2(currentNode.getRight(), newNode);
            }
        } else
        {
            currentNode.incCount();        
        }
    }
    
    public void interation(Node newNode) {
        if (newNode == null) {
            newNode=this.getRoot();
        }
        
            if(newNode.getLeft()!=null)
            System.out.println("prvkov "+newNode.getLeft().getValue()+" je "+newNode.getLeft().getCount());
            if(newNode.getRight()!=null)
                
            System.out.println("prvkov "+newNode.getRight().getValue()+" je "+newNode.getRight().getCount());
            
            
        if (newNode.getLeft() != null) {
            
            //System.out.println("prvkov "+newNode.getLeft().getValue()+" je "+newNode.getLeft().getCount());
            newNode=newNode.getLeft();
            interation(newNode);
        } 
        else if (newNode.getRight() != null) {
            
            //System.out.println("prvkov "+newNode.getRight().getValue()+" je "+newNode.getRight().getCount());
            newNode=newNode.getRight();
            interation(newNode);
        }
        else
        {
            //newNode=newNode.get
        }
    }
        
}
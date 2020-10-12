/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencyTree;


/**
 * Tree Node Class
 */
public class Node {
    private Object value;
    private Node left;
    private Node right;
    private int count=0;

    public Node() {

    }

    public Node(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int cound) {
        this.count=cound;
    }

    void incCount() {
        this.count++;
        }
}
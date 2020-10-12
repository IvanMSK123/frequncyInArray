/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencyTree;

/**
 *
 * @author Ivan Madleňák
 */
public class frequencyTree {

    /**
     * memory is one array and one binary search tree about size pole and one list in iteration
     * O(n) is from n^2 to log2(n)*(n)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pole[]={2,5,9,1,5,20000,1,-4,8,50694,8,500000,1};
        
        BinarySearchTree b=new BinarySearchTree();
        for (int i : pole) {
            Node n=new Node();
            n.setValue(i);
            n.setCount(1);
            b.insert(n);
        }
        
        for(Node i:b.inOrder())
        {
            System.out.println("number "+i.getValue()+" is "+i.getCount()+" time");
        }
        
                
    }
    
}

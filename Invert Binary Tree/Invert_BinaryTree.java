
package invert_binarytree;

import java.util.Scanner;

/*
 * @author Gaurav
 */
public class Invert_BinaryTree {

    Node root = null;
    // ------------------------- add Node method ---------------------------------------
    public void addNode(int a){
  
    Node newNode = new Node(a);
    if(root==null){
     root = newNode;
    }
    else{
      Node temp = root;
      Node temp2 = root;
      while(true){
     if(a<=temp.value){
      temp = temp.left;
      if(temp==null){
       temp2.left = newNode;
       return;
      }
     }
     else{
     temp = temp.right;
     if(temp==null){
       temp2.right = newNode;
       return;
      }
     }
     temp2 = temp;
    }
    }
    }
    // --------------------- Traversing methods -----------------------------------
    public void inOrder(Node r){
    if(r == null)
        return;
    inOrder(r.left);
    System.out.print(" "+r.value);
    inOrder(r.right);
    }
    
    public void postOrder(Node r){
    if(r==null)
        return;
    postOrder(r.left);
    postOrder(r.right);
    System.out.print(" "+r.value);
    }
    
    public void preOrder(Node r){
    if(r==null)
        return;
    System.out.print(" "+r.value);
    preOrder(r.left);
    preOrder(r.right);
    
    }
    
    // returns maximum value
int max(int a, int b){
 return a>b?a:b;
}

int heightOfTree(Node a){
 Node temp = a;
 int h=0;
 if(temp!=null){
  if(temp.left!=null)
      h = 1+heightOfTree(temp.left);
  if(temp.right!=null)
      h = max(h,1 + heightOfTree(temp.right));
 }
 return h;
}
 public int height(){
     return(heightOfTree(root));
    }
 
 public void invert(Node a){
  Node temp = a;
  if(a==null)
      return;
  Node temp2 = temp.right;
  temp.right = temp.left;
  temp.left = temp2;
  invert(temp.left);
  invert(temp.right);
 
   }   
 void invertTree(){
  invert(root);
 }
    
 
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Invert_BinaryTree tree = new Invert_BinaryTree();
        tree.addNode(32);
        tree.addNode(20);
        tree.addNode(35);
        tree.addNode(25);
        tree.addNode(12);
        tree.addNode(40);
        tree.addNode(16);
        
        System.out.print("\nIn-order traversing:");
        tree.inOrder(tree.root);
        System.out.print("\nPre-order traversing:");
        tree.preOrder(tree.root);
        System.out.print("\nPost-order traversing:");
        tree.postOrder(tree.root);
        System.out.print("\nHeight of tree: "+tree.height());
      
        //------- Inverting tree --------
        
        System.out.println("\n----------------------------------------\nTree After Inverting");
        tree.invertTree();
         System.out.print("In-order traversing:");
        tree.inOrder(tree.root);
        System.out.print("\nPre-order traversing:");
        tree.preOrder(tree.root);
        System.out.print("\nPost-order traversing:");
        tree.postOrder(tree.root);
        System.out.print("\nHeight of tree: "+tree.height());
        System.out.println();
        System.exit(0);
    }
    
}

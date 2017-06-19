package binary.search.tree;
import java.util.Scanner;
/*
 * @author Gaurav
 */
public class BinarySearchTree {
Node root=null;  // root node

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
    
    //if node has two child Or degree of node is 2
    boolean full(Node a){
    if(a.left != null && a.right!=null)
        return true;
    else
        return false;
    }
    
    // Returns the smallest node in the right sub tree
    public Node findSmallest(Node a){
    Node temp = a.right;
    if(isLeaf(temp)) return temp;
    Node parent = temp;
    while(true){
    temp = temp.left;
    if(temp.left == null){
     parent.left = temp.right;
     return temp;
    }
    parent = temp;
    }
    
    }  
    public boolean isLeaf(Node a){
     if(a.left == null && a.right == null) return true;
     else return false;
    }
    
    // ---------------------- Delete Node --------------------------------------
    public void deleteNode(int a){
    
    if(a==root.value){
        if(isLeaf(root)){
         root = null;
         return;
        }
     Node smallest = findSmallest(root);
     root.value = smallest.value;
     return;
    }
     
     Node temp = root;
     Node parent = root;
    
    while(true && !isLeaf(parent)){
        
        //  ----  temp.value > a -----
     if(temp.value>a){
      temp = temp.left;
      if(temp.value == a){
          // if temp is a leaf node
        if(isLeaf(temp)){
          parent.left = null;
          return;
        }
        // if temp has two child
        else if(full(temp)){
         Node smallest = findSmallest(temp);
         temp.value = smallest.value;
         return;
        }
        else if(temp.right!=null){
         parent.left = temp.right;
         return;
        }
        else{
         parent.left = temp.left;
         return;
        }
      }
     }
     
     // ----- temp.value < a -------
     else{
     temp = temp.right;
     if(temp.value == a){
          // if temp is a leaf node
        if(isLeaf(temp)){
          parent.right = null;
          return;
        }
        // if temp has two child
        else if(full(temp)){
         Node smallest = findSmallest(temp);
         temp.value = smallest.value;
         return;
        }
        else if(temp.right!=null){
         parent.right = temp.right;
         return;
        }
        else{
         parent.right = temp.left;
         return;
        }
      }
     
     }
     
     parent = temp;
    }
    System.out.println("\n"+a+" is not present in the list");
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
    public int height(){
     return(heightOfTree(root));
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
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
        System.out.print("\nEnter node you want to delete: ");
        int n = scan.nextInt();
        tree.deleteNode(n);
        System.out.print("\nIn-order traversing:");
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


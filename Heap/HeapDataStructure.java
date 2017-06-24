package heapdatastructure;

import java.util.*;
import java.util.Scanner;

/*
 * @author Gaurav
 */
public class HeapDataStructure {
    
    List<Integer> arr = new ArrayList<>();
    
    public boolean exist(int a){
    return a>(arr.size()-1)?false:true;
    }
    
    public void maxHeap(){
    int l = arr.size();
    int k = (l/2)-1;
    while(k>-1){
     int left = (2*k)+1;
     int right = left+1;
     if(exist(left)){
      if(arr.get(left)>arr.get(k))
          Collections.swap(arr, k, left);
     }
     if(exist(right)){
     if(arr.get(right)>arr.get(k))
          Collections.swap(arr, k, right);
     }
     k=k-1;
    }
    }
    
    public void insert(int a){
     arr.add(a);
     maxHeap();
    }
    public void delete_Node(int a){
        if(!arr.contains(a)) {
            System.out.println(a+" is not in list");
            return;
        }
     int index = arr.indexOf(a);
     int last = arr.size() - 1;
     Collections.swap(arr, index, last);
     arr.remove(last);
     maxHeap();
    }
    
    public void dump(){
    System.out.print(" "+arr);
    //sSystem.out.println();
    }
    public int count(){
    return arr.size();
    }
  
    // --------------------- main() -------------------------------
    public static void main(String[] args) {
       HeapDataStructure heap = new HeapDataStructure();
       Scanner scan = new Scanner(System.in);
        int ch,flag=1;
       
        System.out.println("\nHeap operations (By Gaurav Dangi)");
        heap.insert(5);
        heap.insert(4);
        heap.insert(2);
        heap.insert(7);heap.insert(5);
        heap.insert(8);
        heap.dump();
        do{
        System.out.print("\nEnter operation you want to perform\n1]Insertion\n2]Deletion\n-> ");
        ch = scan.nextInt();
        switch(ch){
            case 1: System.out.println("\nInsertion");
                    
                    System.out.println("\nEnter Integer:");
                    int f = scan.nextInt();
                    heap.insert(f);
                    heap.dump();
                    break;
            case 2: System.out.println("\nDeletion");
                    System.out.print("Enter integer you want to delete: ");
                    int j = scan.nextInt();
                    heap.delete_Node(j);
                    heap.dump();
                    break;
            default: System.out.println("\nWrong choice mate!");
                    break;
        }
        System.out.print("\nDo you want to continue? (Press 1 for YES and others for NO)");
        flag = scan.nextInt();
        }while(flag==1);
        }
    }
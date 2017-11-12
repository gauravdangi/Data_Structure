
package heapdatastructure;
import java.util.*;

/*
 * @author Gaurav
 * Implementing Heap data structure using PriorityQueue 
 */
public class HeapWithPriorityQueue {
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer a, Integer b)-> -1*a.compareTo(b));
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    // -------------------- Adding node -----------------------------
    public static void addNode(int value){
        maxHeap.add(value);
        minHeap.add(value);
    }
    
    // --------------------- Removing node --------------------------
    public static void deleteNode(int value){
        if(!maxHeap.contains(value))
            return;
        //remove(maxHeap,value);
        //remove(minHeap,value);
        maxHeap.remove(value);
        minHeap.remove(value);
    }
    
    // ---------------------- printing heap ------------------------
    public static void print(){
        System.out.println("Max Heap: "+maxHeap);
        System.out.println("Min Heap: "+minHeap);
    }
    
    // ---------------------- main() -------------------------------
    public static void main(String[] args){
        addNode(5);
        addNode(4);
        addNode(2);
        addNode(7);
        addNode(5);
        addNode(9);
        addNode(3);
        deleteNode(7);
        deleteNode(3);
        addNode(8);
        deleteNode(5);
        print();
    }
}

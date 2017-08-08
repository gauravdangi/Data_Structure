package graph.using.adjacency.list;
import java.util.*;
/*
 * @author Gaurav
 */

public class GraphUsingAdjacencyList {
private List<Edge> G[];

// ----------- Constructor --------------
public GraphUsingAdjacencyList(int l){
 G = new LinkedList[l];
 for(int i=0;i<G.length;i++)
     G[i] = new LinkedList<>();
}

// ----------- Adding Edge ----------------
public void addEdge(int a,int b,int c){
 G[a].add(0,new Edge(b,c));  // adding every new node at first of the list to reduce time 
}

// ------------- Overriding toString()-------------------------
@Override
public String toString(){
    String output="";
 for(int i=0;i<G.length;i++)
     output+= i+" -> "+G[i]+"\n";
 return output;
}

// ------------------------------- main() -----------------------------------------
    public static void main(String[] args) {
     GraphUsingAdjacencyList g = new GraphUsingAdjacencyList(8);
     g.addEdge(0, 1, 5);
     g.addEdge(0, 3, 5);
     g.addEdge(0, 5, 5);
     g.addEdge(0, 4, 6);
     g.addEdge(1, 0, 5);
     g.addEdge(1, 2, 4);
     g.addEdge(1, 5, 2);
     g.addEdge(2, 1, 5);
     g.addEdge(2, 3, 4);
     g.addEdge(3, 0, 4);
     g.addEdge(3, 2, 1);
     g.addEdge(4, 0, 4);
     g.addEdge(4, 5, 2);
     g.addEdge(5, 1, 1);
     g.addEdge(5, 4, 5);
     g.addEdge(5, 6, 4);
     g.addEdge(6, 7, 3);
     System.out.println(g);
    }
    
}

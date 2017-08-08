
package graph_hashmap;
import java.util.*;
/*
 * @author Gaurav
 */

/*
 Adjcency list using Hashmap
*/
public class Graph_HashMap {
  
 HashMap<String, List<Edge>> map = new HashMap();

 public void addEdge(String name1,String[] name2,int[] dist){
  List<Edge> people = new ArrayList<>();
  for(int i=0;i<name2.length;i++)
      people.add(new Edge(name2[i],dist[i]));
  map.put(name1, people);
 }
 
 @Override
 public String toString(){
 String result="";
 for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" -> "+m.getValue());  
  }  
 return result;
     
 }
 
    public static void main(String[] args) {
       Graph_HashMap G = new Graph_HashMap();
       String[] Gaurav = {"Jenifer Aniston","Kylie Jenner","Yanet Garcia"};
       int[] Gaurav_dist = {1,1,2};
       String[] Pratham = {"Dhinchak Pooja","Meena Boy"};
       int[] Pratham_dist = {1,1}; // very close
       G.addEdge("Gaurav",Gaurav,Gaurav_dist);
       G.addEdge("Pratham", Pratham,Pratham_dist);
       System.out.println(G);
    }
    
}

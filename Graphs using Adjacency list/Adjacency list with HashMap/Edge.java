
package graph_hashmap;

public class Edge {
    String name;
    int distance;
    public Edge(String name,int distance){
    this.name = name;
    this.distance = distance;
    }
    
    @Override
    public String toString(){
     return "(Name: "+name+",Distance: "+distance+")";
    }
}



package graph.using.adjacency.list;
/**
 *
 * @author Gaurav
 */
public class Edge {
    int value;
    int weight;
    public Edge(int value,int weight){
    this.value = value;
    this.weight = weight;
    }
    
    @Override
    public String toString(){
     return "(Value:"+value+",Weight:"+weight+")";
    }
}

# Graph 

A graph data structure consists of a finite (and possibly mutable) set of vertices or nodes or points, together with a set of unordered pairs of these vertices for an undirected graph or a set of ordered pairs for a directed graph. These pairs are known as edges, arcs, or lines for an undirected graph and as arrows, directed edges, directed arcs, or directed lines for a directed graph.

# Adjacency list

In graph theory and computer science, an adjacency list is a collection of unordered lists used to represent a finite graph. Each list describes the set of neighbors of a vertex in the graph. This is one of several commonly used representations of graphs for use in computer programs.
An adjacency list representation for a graph associates each vertex in the graph with the collection of its neighboring vertices or edges. There are many variations of this basic idea, differing in the details of how they implement the association between vertices and collections, in how they implement the collections, in whether they include both vertices and edges or only vertices as first class objects, and in what kinds of objects are used to represent the vertices and edges.

For more information:

Graph: https://en.wikipedia.org/wiki/Graph_(abstract_data_type)

Adjacency list: https://en.wikipedia.org/wiki/Adjacency_list

## Output

### Adjacency list using link list

0 -> [(Value:4,Weight:6), (Value:5,Weight:5), (Value:3,Weight:5), (Value:1,Weight:5)]

1 -> [(Value:5,Weight:2), (Value:2,Weight:4), (Value:0,Weight:5)]

2 -> [(Value:3,Weight:4), (Value:1,Weight:5)]

3 -> [(Value:2,Weight:1), (Value:0,Weight:4)]

4 -> [(Value:5,Weight:2), (Value:0,Weight:4)]

5 -> [(Value:6,Weight:4), (Value:4,Weight:5), (Value:1,Weight:1)]

6 -> [(Value:7,Weight:3)]

7 -> []

### Adjacency list using Hashmap

Gaurav -> [(Name: Jenifer Aniston,Distance: 1), (Name: Kylie Jenner,Distance: 1), (Name: Yanet Garcia,Distance: 2)]

Pratham -> [(Name: Dhinchak Pooja,Distance: 1), (Name: Meena Boy,Distance: 1)]



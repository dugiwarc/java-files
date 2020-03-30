import java.util.*;

class Graph{
    private HashSet<Vertex> nodes;

public Graph() {
        nodes = new HashSet<>();
    }

    public boolean addEdge(Vertex origin, Vertex destination, int weight) {
        return origin.getEdges().add(new Edge(destination, weight));
    }

    public boolean addVertex(Vertex v) {
        return nodes.add(v);
    }

    public static Graph calculateShortestPath(Graph g, Vertex source){
        Set<Vertex> settledNodes = new HashSet<>();
        Set<Vertex> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);
    }


    public void printGraph() {
        for(Vertex vertex : nodes) {
            System.out.print("Vertex nam: " + vertex.getName() + ": ");
            for(Edge edge : vertex.getEdges()){
                System.out.print("destVertex: " + edge.getDestVertex().getName() + " weight: " + edge.getWeight() + " | ");
            }
            System.out.print("\n");
        }
    }
}


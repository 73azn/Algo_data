package Graph;

public class Test_Graph {
    public static void main(String[] args){
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);


        graph.printGraph();

        //Depth First Traversal start at vertices 3
        graph.DFS(3);

        //Breadth First Traversal start at vertices 0
        graph.BFS(0);
    }
}

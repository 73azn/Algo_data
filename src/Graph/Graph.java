package Graph;
import DoubleLL.Node.Queue;
public class Graph {
    private int v;
    private int edge;
    private int[][] matrix;
    public Graph(int size) {
        this.v = size;
        this.edge = 0;
        matrix = new int[size][size];
    }

    public void addEdge(int v, int u) {
        matrix[v][u] = 1;
        matrix[u][v] = 1;
        edge++;
    }

    //Printing
    public void printGraph() {
        for(int i=0 ; i<matrix.length ; i++) {
            System.out.print(i + " : ");
            for(int j=0 ; j<matrix[i].length ; j++) {
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    //Traversing
    public void DFS() {

    }

    public void BFS(int v) {
        boolean[] visited = new boolean[this.v];
        Queue queue = new Queue();
        visited[v] = true;
        queue.Enqueue(v);

        while(!queue.isEmpty()) {

        }
    }






    public int NumberofVertices() {
        return this.v;
    }
    public int NumberofEdges() {
        return this.edge;
    }


}

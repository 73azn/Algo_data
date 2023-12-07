package Graph;
import DoubleLL.Node.Queue;
import DoubleLL.Node.stack;
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
    private void DFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for(int i=0 ; i< matrix[v].length ;i++) {
            if(matrix[v][i] == 1 && !visited[i]) {
                DFS(i, visited);
            }
        }

    }

    public void DFS(int v) {
        boolean[] visited = new boolean[this.v];
        DFS(v, visited);
        System.out.println();
    }

    public void BFS(int v) {
        boolean[] visited = new boolean[this.v];
        Queue queue = new Queue();
        visited[v] = true;
        queue.EnqueueWithOutDetail(v);

        while(!queue.isEmpty()) {
            int curr = queue.DequeueWithReturn();
            System.out.print(curr + " ");
            for(int i=0 ; i<matrix[curr].length ; i++) {
                if(matrix[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.EnqueueWithOutDetail(i);
                }
            }
        }
        System.out.println();
    }






    public int NumberofVertices() {
        return this.v;
    }
    public int NumberofEdges() {
        return this.edge;
    }


}

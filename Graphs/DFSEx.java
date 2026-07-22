package Graphs;

import java.util.ArrayList;

public class DFSEx {

    public static void dfs(ArrayList<ArrayList<Integer>> graph , int start , boolean visited[]) {
        visited[start] = true;
        System.out.print(start + " ");

        for(int i : graph.get(start)) {
            if(!visited[i]) {
                dfs(graph, i , visited);
            }
        } 
    }
    public static void main(String[] args) {
          int v = 7;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected Graph
        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(5);
        graph.get(5).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(2).add(4);
        graph.get(4).add(2);

        graph.get(5).add(6);
        graph.get(6).add(5);

        boolean[] visited = new boolean[v];

        System.out.print("DFS Traversal: ");
        dfs(graph, 1, visited);
    }
}

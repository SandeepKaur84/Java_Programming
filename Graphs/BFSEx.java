package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSEx {
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.size()];

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int ele = q.poll();
            System.out.print(ele + " ");

            for (int i : graph.get(ele)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 7;
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println(graph);

        // directed graph
        // graph.get(1).add(2);
        // graph.get(1).add(5);
        // graph.get(2).add(3);
        // graph.get(2).add(4);
        // graph.get(5).add(6);
        // for(int i = 1 ; i < v ; i++) {
        // System.out.println(i + " -> " + graph.get(i));
        // }

        // undirected graph
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

        bfs(graph, 1);

    }
}

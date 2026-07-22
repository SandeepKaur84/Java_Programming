package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversals {

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

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int start, boolean visited[]) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int i : graph.get(start)) {
            if (!visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }

    public static void dfsWithStack(ArrayList<ArrayList<Integer>> graph, int start) {
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[graph.size()];

        s.push(start);
        while (!s.isEmpty()) {
            int ele = s.pop();
            if (!visited[ele]) {
                visited[ele] = true;
                System.out.print(ele + " ");

                ArrayList<Integer> list = graph.get(ele);
                for (int i = list.size() - 1; i >= 0; i--) {
                    int neighbour = list.get(i);

                    if (!visited[neighbour]) {
                        s.push(neighbour);
                    }
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

        graph.get(1).add(2);
        graph.get(1).add(5);

        graph.get(2).add(3);
        graph.get(2).add(4);

        graph.get(5).add(6);

        for (int i = 1; i < v; i++) {
            System.out.println(i + " ->  " + graph.get(i));
        }

        boolean visited[] = new boolean[v];
        bfs(graph, 1);
        System.out.println();

        dfs(graph, 1, visited);
        System.out.println();

        dfsWithStack(graph, 1);

    }
}

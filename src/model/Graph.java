package model;

import java.util.*;

public class Graph {
    private final Map<String, List<Edge>> adjList = new HashMap<>();

    public void addEdge(String from, String to, int weight) {
        adjList.computeIfAbsent(from, k -> new ArrayList<>()).add(new Edge(from, to, weight));
        adjList.computeIfAbsent(to, k -> new ArrayList<>());
    }

    public List<Edge> getEdges(String node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }

    public Set<String> getNodes() {
        return adjList.keySet();
    }
}

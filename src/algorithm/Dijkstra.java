package algorithm;

import model.Edge;
import model.Graph;
import model.Node;
import java.util.*;

public class Dijkstra {
    public static Map<String, Integer> run(Graph graph, String start) {
        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (String node : graph.getNodes()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            for (Edge edge : graph.getEdges(current.name)) {
                int newDist = distances.get(current.name) + edge.weight;
                if (newDist < distances.get(edge.to)) {
                    distances.put(edge.to, newDist);
                    pq.add(new Node(edge.to, newDist));
                }
            }
        }

        return distances;
    }
}

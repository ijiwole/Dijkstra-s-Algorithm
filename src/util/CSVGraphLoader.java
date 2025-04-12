package util;

import model.Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVGraphLoader {

    public static Graph loadGraphFromCSV(String filepath) {
        Graph graph = new Graph();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            boolean skipHeader = true;

            while ((line = br.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] parts = line.split(",");
                String source = parts[0].trim();
                String destination = parts[1].trim();
                int weight = Integer.parseInt(parts[2].trim());

                graph.addEdge(source, destination, weight);
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        return graph;
    }
}

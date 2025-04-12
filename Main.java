import algorithm.Dijkstra;
import model.Graph;
import util.CsvGraphLoader;
import util.Logger;
import util.Timer;

public class Main {
    public static void main(String[] args) {
        String filePath = "djikstar_dataset.csv";
        Timer timer = new Timer();

        Logger.log("Loading graph...");
        Graph graph = CsvGraphLoader.loadGraphFromCSV(filePath);

        Logger.log("Starting Dijkstra from node A...");
        timer.start();
        Map<String, Integer> distances = Dijkstra.run(graph, "A");
        timer.stop();

        Logger.log("Shortest distances from A:");
        distances.forEach((node, distance) ->
                System.out.println("  A -> " + node + " = " + distance));

        timer.printElapsed("Execution Time");

        Logger.log("Saving performance to file...");
        PerformanceSaver.save(timer.getElapsedTimeInMillis(), "performance-metric.txt");
    }
}

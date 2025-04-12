package util;

import java.io.FileWriter;
import java.io.IOException;

public class PerformanceSaver {
    public static void save(long timeInMillis, String path) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write("Execution Time: " + timeInMillis + " ms\n");
        } catch (IOException e) {
            Logger.log("ERROR", "Could not write performance file: " + e.getMessage());
        }
    }
}

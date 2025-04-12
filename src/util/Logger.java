package util;

public class Logger {
    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void log(String tag, String message) {
        System.out.println("[" + tag.toUpperCase() + "] " + message);
    }
}

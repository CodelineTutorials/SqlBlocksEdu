package de.luca.debug;

public class Logger {

    private static int warningCount = 0;
    private static int errorCount = 0;

    public static void debug(String text) {
        // DebugLog only operates when the debug mode variable is set to true
        if(Debug.DEBUG_ENABLED) {
            System.out.println("DEBUG: " + text);
        }
    }

    public static void info(String text) {
        System.out.println("INFO: " + text);
    }

    public static void warning(String text) {
        System.err.println("WARNING: " + text);
        warningCount++;
    }

    public static void error(String text) {
        System.err.println("ERROR: " + text);
        errorCount++;
    }

    public static int getWarningCount() {
        return warningCount;
    }

    public static int getErrorCount() {
        return errorCount;
    }

}

package de.luca.debug;

import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Timer;

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

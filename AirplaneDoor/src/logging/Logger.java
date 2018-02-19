package logging;

import main.Configuration;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A logging instance writing all received messages to the
 * standard output channel and to a log file specified in
 * the {@link Configuration} class.
 */
public enum Logger {
    instance;

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private BufferedWriter writer;

    /**
     * Builds the logger with the log file path specified in the Configuration.
     */
    public void init() {
        try {
            writer = new BufferedWriter(new FileWriter(new File(Configuration.instance.logFilePath)));
        } catch (FileNotFoundException exc) {
            System.err.println("Error: Log File '" + Configuration.instance.logFilePath +
                    "' could not be created!");
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    /**
     * Writes a message to the log file preceding all new line characters
     * with the current date prefix.
     *
     * @param message the message
     */
    public void write(String message) {
        try {
            String datePrefix = "[" + dateFormat.format(new Date()) + "]: ";
            writer.write(datePrefix + message.replaceAll("\n", "\n" + datePrefix) +
                    Configuration.instance.lineSeparator);
            writer.flush();
        } catch (IOException ioe) {
            System.err.println("Fatal Error occurred during logging: IO Error (see the stacktrace)");
            ioe.printStackTrace();
        }
    }

    /**
     * Logs a message to the log file and the standard output.
     *
     * @param message the message
     */
    public void log(String message) {
        write(message);
        System.out.println(message);
    }

    public void log(Object object) {
        log(object.toString());
    }

    /**
     * Writes a new line in the log file and on standard output.
     */
    public void newLine() {
        write("");
        System.out.println();
    }

    /**
     * Closes the logging instance.
     */
    public void close() {
        try {
            writer.close();
        } catch (IOException ioe) {
            System.err.println("Fatal Error occurred during closing: IO Error (see the stacktrace)");
            ioe.printStackTrace();
        }
    }
}

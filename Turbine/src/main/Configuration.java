package main;

public enum Configuration {
    instance;

    public String userDirectory = System.getProperty("user.dir");
    public String fileSeparator = System.getProperty("file.separator");
    public String lineSeparator = System.lineSeparator();
    public String moduleName = "Turbine";

    public String logFilePath = buildLogFilePath();

    /**
     * Used to construct the correct log file path. When running the JUnit Tests
     * the user directory already contains the part "Turbine/" because they are
     * executed in a different directory and manner. To prevent the log file path
     * from containing "Turbine" twice and causing {@link java.io.FileNotFoundException},
     * check the user directory for occurrence first before appending the rest.
     *
     * @return the correct log file path for the specific user directory
     */
    private String buildLogFilePath() {
        if (userDirectory.endsWith("/" + moduleName)) {
            return userDirectory + fileSeparator + "log" + fileSeparator + moduleName + ".log";
        }

        return userDirectory + fileSeparator + moduleName + fileSeparator + "log" +
                fileSeparator + moduleName + ".log";
    }
}

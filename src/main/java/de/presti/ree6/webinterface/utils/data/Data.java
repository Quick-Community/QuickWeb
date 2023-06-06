package de.presti.ree6.webinterface.utils.data;

import de.presti.ree6.webinterface.Server;

/**
 * Utility class to save long term used Data.
 */
public class Data {

    // Completely remove this, and migrate it into the main class.

    /**
     * Constructor for the Data Utility class.
     */
    private Data() {
        throw new IllegalStateException("Utility class");
    }

    public static String getHostname() {
        return Server.getInstance().getConfig().getConfiguration().getString("webinterface.hostname", "app.quickfirecorp.ru");
    }

    public static  String getHostUrl() {
        boolean useSSL = Server.getInstance().getConfig().getConfiguration().getBoolean("webinterface.usingSSL", true);
        return (useSSL ? "https://" : "http://") + getHostname();
    }

    // Current Domain of the Website.
    public static final String WEBSITE = "https://app.quickfirecorp.ru";

    // Advertisement, because of Sponsors.
    public static final String ADVERTISEMENT = "powered by Tube-Hosting";
}


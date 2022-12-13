package de.schulung.samples;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Start {

    private static final Logger logger = LogManager.getLogger(Start.class);

    public static void main(String[] args) {
        logger.info("Anwendung startet.");
        logger.info(new Person("Tom")::sayHello);
    }

}

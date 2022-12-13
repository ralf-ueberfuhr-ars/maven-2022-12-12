package de.schulung.samples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SampleTest {

    private static final Logger logger = LogManager.getLogger(SampleTest.class);

    @Test
    void test1() {
        logger.info("test1");
    }

    @Test
    @Tag("release-only")
    void test2() {
        logger.info("test2");
    }

    @Test
    void test3() {
        logger.info("test3");
    }

    @Test
    @Tag("release-only")
    void test4() {
        logger.info("test4");
    }

    @Test
    void test5() {
        logger.info("test5");
    }

}

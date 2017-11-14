package org.example.module2;

import org.joda.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Module2 {
    private static final Logger LOG = LoggerFactory.getLogger(Module2.class);

    public static Instant getJodaTime() {

        return Instant.now();
    }

    public static void main(String[] args) {
        Instant instant = Module1.getJodaTime();
        LOG.info("Time: " + instant);
    }

}


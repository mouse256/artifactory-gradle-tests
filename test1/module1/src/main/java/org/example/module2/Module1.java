package org.example.module2;

import org.joda.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Module1 {
    private static final Logger LOG = LoggerFactory.getLogger(Module1.class);

    public static Instant getJodaTime() {
        LOG.info("Creating time");
        return Instant.now();
    }

}


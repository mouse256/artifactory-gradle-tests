package org.example.module1a;

import org.joda.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Module1a {
    private static final Logger LOG = LoggerFactory.getLogger(Module1a.class);

    public static Instant getJodaTime() {
        LOG.info("Creating time");
        return Instant.now();
    }

}


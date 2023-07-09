package com.github.yuizho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class External {
    private final static Logger logger = LoggerFactory.getLogger(External.class);
    public void printLogs() {
        logger.debug("debug log by External");
        logger.info("info log by External");
        logger.error("error log by External");
    }
}

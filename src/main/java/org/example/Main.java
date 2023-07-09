package org.example;

import com.github.yuizho.External;
import org.example.application.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);
    private final static Marker IMPORTANT = MarkerFactory.getMarker("important");

    public static void main(String[] args) {
        var accountService = new AccountService();
        int maxAge = accountService.findMaxAge();
        logger.info("The max age is {}", maxAge);

        logger.debug("this is debug log!!");
        logger.warn("this is warn log!!");
        logger.error("this is error log!!");

        logger.info(IMPORTANT, "this is marked as important!!");

        new External().printLogs();
    }
}
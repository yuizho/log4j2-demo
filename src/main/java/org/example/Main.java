package org.example;

import org.example.application.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hi!! this is Main.java!!");

        var accountService = new AccountService();
        int maxAge = accountService.findMaxAge();
        logger.info("The max age is {}", maxAge);
    }
}
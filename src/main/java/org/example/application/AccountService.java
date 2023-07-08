package org.example.application;

import org.example.domain.Account;
import org.example.repository.AccountRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class AccountService {
    private final static Logger logger = LoggerFactory.getLogger(AccountService.class);
    public int findMaxAge() {
        var accountRepository = new AccountRepositoryImpl();
        return accountRepository.findAll()
                .stream()
                .peek(a -> logger.info("Fetched Account is {}", a))
                .max(Comparator.comparing(Account::age))
                .map(Account::age)
                .orElseGet(() -> 0);
    }
}

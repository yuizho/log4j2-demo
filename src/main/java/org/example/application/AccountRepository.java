package org.example.application;

import org.example.domain.Account;

import java.util.List;

public interface AccountRepository {
    List<Account> findAll();
}

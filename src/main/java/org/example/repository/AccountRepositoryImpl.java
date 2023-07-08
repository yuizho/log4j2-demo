package org.example.repository;

import org.example.application.AccountRepository;
import org.example.domain.Account;

import java.util.List;

public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public List<Account> findAll() {
        return List.of(
                new Account("hoge", 20),
                new Account("huga", 25),
                new Account("foo", 40)
        );
    }
}

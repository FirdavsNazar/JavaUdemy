package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;
import pojo.Checking;

public class AccountRepository {

    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {
            this.datastore.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        return null;
    }

    public void updateAccount(Account account) {

    }

    public void deleteAccount(String id) {

    }

}


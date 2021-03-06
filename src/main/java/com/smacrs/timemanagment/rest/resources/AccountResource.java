package com.smacrs.timemanagment.rest.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.smacrs.timemanagment.core.entities.systementity.Account;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Chris on 6/28/14.
 */
public class AccountResource extends ResourceSupport {
    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    public Account toAccount() {
        Account account = new Account();
        account.setUsername(name);
        account.setPassword(password);
        return account;
    }
}

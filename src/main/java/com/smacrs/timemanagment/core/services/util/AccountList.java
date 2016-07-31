package com.smacrs.timemanagment.core.services.util;

import java.util.ArrayList;
import java.util.List;

import com.smacrs.timemanagment.core.entities.Account;

/**
 * Created by Chris on 7/22/14.
 */
public class AccountList {

	private List<Account> accounts = new ArrayList<Account>();

	public AccountList(List<Account> list) {
		this.accounts = list;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}

package com.democrudproj.repository;

import org.springframework.data.repository.CrudRepository;

import com.democrudproj.bean.Account;

public interface AccountRepos extends CrudRepository<Account,String> {

}

package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAccountsService {
    void createAccount(CustomerDTO customerDTO);
    CustomerDTO fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDTO);
    boolean deleteAccount(String mobileNumber);

}
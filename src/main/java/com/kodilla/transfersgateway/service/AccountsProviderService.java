package com.kodilla.transfersgateway.service;

import com.kodilla.transfersgateway.connector.AccountsConnector;
import com.kodilla.transfersgateway.domain.TransferAccountValueCheck;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountsProviderService {

    private final AccountsConnector accountsConnector;

    public TransferAccountValueCheck getAccountValue(Long customerId) {
        return accountsConnector.getAccounts(customerId);
    }

}

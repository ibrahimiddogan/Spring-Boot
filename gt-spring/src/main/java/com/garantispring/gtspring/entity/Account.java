package com.garantispring.gtspring.entity;

public class Account {
    @Id
    private Long id;

    private Long customerId;

    private String ibanNo;

    private Long currentBalance;
}

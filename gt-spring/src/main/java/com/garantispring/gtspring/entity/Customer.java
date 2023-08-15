package com.garantispring.gtspring.entity;


@Getter
@Setter
@Entity

public class Customer {
    @Id
    private Long id;

    private String name;

    private String surname;

    private Long identityNo;

    private Long password;

    private String phoneNumber;

    private String email;
}
